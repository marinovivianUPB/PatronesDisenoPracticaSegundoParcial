package patronesdisenosegundoparcial.ejercicio2ChainResponsability;

public class Client {
    public static void main(String[] args) {
        CuerpoEjercitoManager manager = new CuerpoEjercitoManager();

        manager.orden("Limpiezas");
        manager.orden("Manifestaciones");
        manager.orden("Desbloqueos");
        manager.orden("Desbloqueos/Manifestaciones");
        manager.orden("Disciplina");
        manager.orden("Entrevistas");

    }
}
