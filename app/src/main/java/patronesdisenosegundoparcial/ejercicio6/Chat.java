package patronesdisenosegundoparcial.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Chat implements ICanalComunicacion {

    private List<Desarrollador> developers = new ArrayList<>();

    @Override
    public ICanalComunicacion quitarSuscripcion(Desarrollador desarrollador) {
        developers.remove(desarrollador);
        return this;
    }

    @Override
    public void send(String message, Persona persona, Persona recipiente) {
        System.out.println("---------------------DE:--------------------");
        persona.show();
        System.out.println("---------------------PARA--------------------");
        for(Persona aux : developers){
            if(recipiente.equals(aux)){
                aux.recibirMensaje(message);
                break;
            }
        }
    }

    @Override
    public void send(String message, Persona persona) {
        System.out.println("---------------------ENVIANDO A GRUPO--------------------");
        for(Persona aux : developers){
            if(!persona.equals(aux)){
                aux.recibirMensaje(message);
            }
        }
    }

    @Override
    public ICanalComunicacion suscribir(Desarrollador desarrollador) {
        developers.add(desarrollador);
        return this;
    }
    
}
