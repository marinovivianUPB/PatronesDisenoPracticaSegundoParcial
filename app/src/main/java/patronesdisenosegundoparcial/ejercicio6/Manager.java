package patronesdisenosegundoparcial.ejercicio6;

public class Manager {
    private IEstructurador estructurador;

    public Manager(IEstructurador estructurador) {
        this.estructurador = estructurador;
    }

    public String construirMensaje(Desarrollador desarrollador){
        return this.estructurador.construirMensaje(desarrollador);
    }
}
