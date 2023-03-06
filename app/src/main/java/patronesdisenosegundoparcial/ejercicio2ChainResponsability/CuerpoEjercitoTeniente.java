package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public class CuerpoEjercitoTeniente implements ICuerpoEjercito {
    
    private ICuerpoEjercito next;

    @Override
    public ICuerpoEjercito next() {
        return next;
    }

    @Override
    public void orden(String orden) {
        System.out.println("---------------------------------------TENIENTE----------------------------------------");
        System.out.println("ORDEN: "+orden);
        if(orden.toLowerCase().equals("disciplina")){
           
            System.out.println("EL TENIENTE ATENDERA LA ORDEN DE DISCIPLINA");
        } else{
            System.out.println("EL TENIENTE NO PUEDE ATENDER ESTA ORDEN");
            this.next.orden(orden);
        }
    }

    @Override
    public void setNext(ICuerpoEjercito next) {
        this.next = next;
    }
    
}