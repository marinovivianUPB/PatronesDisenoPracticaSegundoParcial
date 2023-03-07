package patronesdisenosegundoparcial.ejercicio7;

public class Client {
    public static void main(String[] args) {
        Persona p0 = new Persona("juan", "123").setPrestamoOriginal(100);
        Banco b = new Banco();
        b.anadirPersona(p0);


        b.pagoPrestamo(p0, 25);
        b.pagoPrestamo(p0, 26);
        b.pagoPrestamo(p0, 25);
        b.pagoPrestamo(p0, 24);

        Persona p1 = new Persona("jorge", "1234").setPrestamoOriginal(100);
        b.anadirPersona(p1);

        b.pagoPrestamo(p1, 100);
    }
}
