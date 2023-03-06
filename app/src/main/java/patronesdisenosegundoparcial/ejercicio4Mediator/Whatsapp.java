package patronesdisenosegundoparcial.ejercicio4Mediator;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements ICanalComunicacion{

    private List<Persona> grupo = new ArrayList<>();
    private List<Persona> contactos = new ArrayList<>();

    public Whatsapp addPersonaToGrupo(Persona persona){
        grupo.add(persona);
        return this;
    }

    public Whatsapp addPersonaToContactos(Persona persona){
        contactos.add(persona);
        return this;
    }


    public List<Persona> getGrupo() {
        return grupo;
    }




    public void setGrupo(List<Persona> grupo) {
        this.grupo = grupo;
    }




    public List<Persona> getContactos() {
        return contactos;
    }




    public void setContactos(List<Persona> contactos) {
        this.contactos = contactos;
    }




    @Override
    public void send(String message, Persona persona, Persona recipiente) {
        System.out.println("---------------------DE:--------------------");
        persona.show();
        System.out.println("---------------------PARA--------------------");
        for(Persona aux : contactos){
            if(recipiente.equals(aux)){
                aux.recibir(message);
                break;
            }
        }
    }

    @Override
    public void send(String message, Persona persona) {
        System.out.println("---------------------ENVIANDO A GRUPO--------------------");
        persona.show();
        System.out.println("---------------------ENVIANDO A GRUPO--------------------");
        for(Persona aux : grupo){
            if(!persona.equals(aux)){
                aux.recibir(message);
            }
        }
    }
    
}
