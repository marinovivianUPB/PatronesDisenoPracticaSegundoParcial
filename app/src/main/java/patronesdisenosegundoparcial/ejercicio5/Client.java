package patronesdisenosegundoparcial.ejercicio5;

public class Client {
    public static void main(String[] args) {

        Git g = new Git();
        Github gh = new Github();

        Commit a = new Commit();
        a.addCodigo("Primera Linea");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 1", "12hz"));

        a.addCodigo("SEGUNDA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 2", "13hz"));

        a.addCodigo("TERCERA LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 3", "14hz"));

        a.addCodigo("cuarta LINEA");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 4", "15hz"));

        a.addCodigo("quinta linea");
        g.setCommit(a);
        gh.createCommit(g.crearMemento("1.1.23", "linea 5", "16hz"));

        a.show();

        g.suscribir(new Desarrollador("juan", "1")).suscribir(new Desarrollador("jose", "12")).suscribir(new Desarrollador("jorge", "123"));

        System.out.println("VOLVIENDO AL PRIMER COMMIT: ");

        a = g.recuperarCommit(gh.getCommit("12hz"));
        a.show();

        g.quitarSuscripcion(new Desarrollador("juan", "1")).quitarSuscripcion(new Desarrollador("jose", "12"))
        .quitarSuscripcion(new Desarrollador("jorge", "123"));

        g.suscribir(new Desarrollador("Maria", "1")).suscribir(new Desarrollador("Elena", "12")).suscribir(new Desarrollador("Lucia", "123"));

        System.out.println("VOLVIENDO AL QUINTO COMMIT: ");

        a = g.recuperarCommit(gh.getCommit("16hz"));
        a.show();

    }
}
