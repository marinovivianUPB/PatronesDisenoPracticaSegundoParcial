package patronesdisenosegundoparcial.ejercicio6;

public class Client {
    public static void main(String[] args) {

        //OBSERVER MEDIATOR Y STRATEGY

        Chat c = new Chat();

        Desarrollador p0 = new Desarrollador("Alan", "1").setCanalComunicacion(c);
        Desarrollador p1 = new Desarrollador("Alicia", "12").setCanalComunicacion(c);
        Desarrollador p2 = new Desarrollador("Alana", "123").setCanalComunicacion(c);
        Desarrollador p3 = new Desarrollador("Ana", "1234").setCanalComunicacion(c);

        c.suscribir(p0).suscribir(p1).suscribir(p2).suscribir(p3);

        String accion = "backlog";

        Manager m;

        if(accion.equals("backlog")){
            m = new Manager(new Backlog());
        } else{
            m = new Manager(new Codigo());
        }

        c.send(m.construirMensaje(p3), p3);

        accion = "codigo";

        if(accion.equals("backlog")){
            m = new Manager(new Backlog());
        } else{
            m = new Manager(new Codigo());
        }

        c.send(m.construirMensaje(p3), p3, p0);
    }
}
