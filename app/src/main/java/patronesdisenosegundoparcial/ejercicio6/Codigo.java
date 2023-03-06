package patronesdisenosegundoparcial.ejercicio6;

public class Codigo implements IEstructurador {

    @Override
    public String construirMensaje(Desarrollador desarrollador) {
        String aux = desarrollador.getNombre()+" ("+desarrollador.getCi()+") ESTA SUBIENDO CODIGO";
        return aux;
    }
    
}

