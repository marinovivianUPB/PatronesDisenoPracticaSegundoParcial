package patronesdisenosegundoparcial.ejercicio4Mediator;

public class Client {
    public static void main(String[] args) {
        Whatsapp w = new Whatsapp();

        Persona p0 = new Persona("Alan", "1").setCanalComunicacion(w);
        Persona p1 = new Persona("Roger", "2").setCanalComunicacion(w);
        Persona p2 = new Persona("Jessica", "3").setCanalComunicacion(w);
        Persona p3 = new Persona("Juan", "4").setCanalComunicacion(w);
        Persona p4 = new Persona("Jose", "5").setCanalComunicacion(w);
        Persona p5 = new Persona("Jorge", "6").setCanalComunicacion(w);
        Persona p6 = new Persona("Luis", "7").setCanalComunicacion(w);
        Persona p7 = new Persona("Mario", "8").setCanalComunicacion(w);
        Persona p8 = new Persona("Luigi", "9").setCanalComunicacion(w);
        Persona p9 = new Persona("Durazno", "10").setCanalComunicacion(w);

        w.addPersonaToContactos(p0);
        w.addPersonaToContactos(p1);
        w.addPersonaToContactos(p2);
        w.addPersonaToContactos(p3);
        w.addPersonaToContactos(p4);
        w.addPersonaToContactos(p5);
        w.addPersonaToContactos(p6);
        w.addPersonaToContactos(p7);
        w.addPersonaToContactos(p8);
        w.addPersonaToContactos(p9);

        w.addPersonaToGrupo(p0);
        w.addPersonaToGrupo(p1);
        w.addPersonaToGrupo(p2);
        w.addPersonaToGrupo(p3);
        w.addPersonaToGrupo(p4);
        w.addPersonaToGrupo(p5);
        w.addPersonaToGrupo(p6);
        w.addPersonaToGrupo(p7);
        w.addPersonaToGrupo(p8);
        w.addPersonaToGrupo(p9);


        p0.send("holi owo", p1);
        p9.send("BUENAS TARDES");
    }
}
