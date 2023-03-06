package patronesdisenosegundoparcial.ejercicio5;

public interface IRepositorio {
    IRepositorio suscribir(Desarrollador desarrollador);
    IRepositorio quitarSuscripcion(Desarrollador desarrolador);
    void notificar(String mensaje);
}
