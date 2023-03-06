package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public class CuerpoEjercitoCoronel implements ICuerpoEjercito {
    
    private ICuerpoEjercito next;

    @Override
    public ICuerpoEjercito next() {
        return next;
    }

    @Override
    public void orden(String orden) {
        System.out.println("---------------------------------------CORONEL----------------------------------------");
        System.out.println("ORDEN: "+orden);
        if(orden.toLowerCase().equals("desbloqueos")||orden.toLowerCase().equals("manifestaciones")
        ||orden.toLowerCase().equals("desbloqueos/manifestaciones")){
           
            System.out.println("EL CORONEL ATENDERA LA ORDEN DE "+orden.toUpperCase());
        } else{
            System.out.println("EL CORONEL NO PUEDE ATENDER ESTA ORDEN");
            this.next.orden(orden);
        }
    }

    @Override
    public void setNext(ICuerpoEjercito next) {
        this.next = next;
    }
    
}
