package patronesdisenosegundoparcial.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IHandler, IBanco{

    private IHandler next;

    private List<Persona> prestamos = new ArrayList<>();

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void pagoPrestamo(Persona persona, double montoAPagar) {
        if(prestamos.contains(persona)){
            Cajero c = new Cajero();
            AgenteCredito a = new AgenteCredito();
            Supervisor s = new Supervisor();
            EncargadoPrestamos e = new EncargadoPrestamos();

            this.setNext(c);
            c.setNext(a);
            a.setNext(s);
            s.setNext(e);

            c.setBanco(this);
            a.setBanco(this);
            s.setBanco(this);
            e.setBanco(this);

            this.next.pagoPrestamo(persona, montoAPagar);
        }
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    public IBanco quitarPersona(Persona persona) {
        prestamos.remove(persona);
        return this;
    }

    @Override
    public void send(String message, Persona persona) {
        prestamos.stream().filter(a -> a.equals(persona)).forEach(a -> a.recibirMensaje(message));
    }

    public IBanco anadirPersona(Persona persona) {
        prestamos.add(persona);
        return this;
    }

    
}
