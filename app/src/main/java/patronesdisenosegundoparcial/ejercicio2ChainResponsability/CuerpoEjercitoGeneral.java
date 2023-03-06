package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public class CuerpoEjercitoGeneral implements ICuerpoEjercito {
    
    private ICuerpoEjercito next;

    @Override
    public ICuerpoEjercito next() {
        return next;
    }

    @Override
    public void orden(String orden) {
        System.out.println("---------------------------------------GENERAL----------------------------------------");
        System.out.println("ORDEN: "+orden);
        if(orden.toLowerCase().equals("entrevistas")){
           
            System.out.println("EL GENERAL ATENDERA LA ORDEN DE ENTREVISTA");
        } else{
            System.out.println("EL GENERAL NO PUEDE ATENDER ESTA ORDEN");
            this.next.orden(orden);
        }
    }

    @Override
    public void setNext(ICuerpoEjercito next) {
        this.next = next;
    }
    
}