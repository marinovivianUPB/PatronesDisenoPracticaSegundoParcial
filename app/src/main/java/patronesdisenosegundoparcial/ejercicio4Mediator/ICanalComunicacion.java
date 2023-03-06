package patronesdisenosegundoparcial.ejercicio4Mediator;

public interface ICanalComunicacion {
    void send(String message, Persona persona, Persona recipiente);
    void send(String message, Persona persona);
}
