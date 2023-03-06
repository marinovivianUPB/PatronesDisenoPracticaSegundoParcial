package patronesdisenosegundoparcial.ejercicio6;

public class Backlog implements IEstructurador {

    @Override
    public String construirMensaje(Desarrollador desarrollador) {
        String aux = desarrollador.getNombre()+" ("+desarrollador.getCi()+") ESTA TOMANDO UNA TAREA DEL BACKLOG";
        return aux;
    }
    
}
