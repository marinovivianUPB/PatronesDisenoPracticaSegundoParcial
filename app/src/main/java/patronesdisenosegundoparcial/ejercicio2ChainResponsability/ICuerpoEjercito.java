package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public interface ICuerpoEjercito {
    void setNext(ICuerpoEjercito next);
    ICuerpoEjercito next();

    // criterio para menejar el problema
    void orden(String orden);

}
