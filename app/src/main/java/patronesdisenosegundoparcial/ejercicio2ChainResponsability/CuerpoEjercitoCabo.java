package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public class CuerpoEjercitoCabo implements ICuerpoEjercito {
    
    private ICuerpoEjercito next;

    @Override
    public ICuerpoEjercito next() {
        return next;
    }

    @Override
    public void orden(String orden) {
        System.out.println("---------------------------------------CABO----------------------------------------");
        System.out.println("ORDEN: "+orden);
        if(orden.toLowerCase().equals("limpiezas")){
           
            System.out.println("EL CABO ATENDERA LA ORDEN DE LIMPIEZA");
        } else{
            System.out.println("EL CABO NO PUEDE ATENDER ESTA ORDEN");
            this.next.orden(orden);
        }
    }

    @Override
    public void setNext(ICuerpoEjercito next) {
        this.next = next;
    }
    
}
