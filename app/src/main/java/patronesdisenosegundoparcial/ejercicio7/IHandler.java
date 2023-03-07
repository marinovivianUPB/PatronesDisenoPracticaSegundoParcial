package patronesdisenosegundoparcial.ejercicio7;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void pagoPrestamo(Persona persona, double montoAPagar);
}
