package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public class CuerpoEjercitoManager implements ICuerpoEjercito {
    
    private ICuerpoEjercito next;

    @Override
    public ICuerpoEjercito next() {
        return next;
    }

    @Override
    public void orden(String orden) {
        CuerpoEjercitoCabo cabo = new CuerpoEjercitoCabo();
        CuerpoEjercitoCoronel coronel = new CuerpoEjercitoCoronel();
        CuerpoEjercitoGeneral general = new CuerpoEjercitoGeneral();
        CuerpoEjercitoTeniente teniente = new CuerpoEjercitoTeniente();

        this.setNext(cabo);
        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.next.orden(orden);
    }

    @Override
    public void setNext(ICuerpoEjercito next) {
        this.next = next;
    }
    
}
