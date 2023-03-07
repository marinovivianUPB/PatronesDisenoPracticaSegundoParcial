package patronesdisenosegundoparcial.ejercicio7;

public class EncargadoPrestamos implements IHandler{

    IHandler next;
    Banco banco;

    public void setBanco(Banco banco){
        this.banco = banco;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void pagoPrestamo(Persona persona, double montoAPagar) {
        if(persona.getPorcentajePagado() == 100){
            System.out.println("----------------------------------------------------");
            System.out.println("EL ENCARGADO DE PRESTAMOS ATENDERA EL PAGO...");

            System.out.println("EL PRESTAMO HA SIDO COMPLETAMENTE PAGADO...");

            banco.send("SE REALIZARA LA DEVOLUCION DE DOCUMENTOS...", persona);
            banco.quitarPersona(persona);

        } else{
            System.out.println("----------------------------------------------------");
            System.out.println("EL ENCARGADO DE PRESTAMOS NO PUEDE ATENDER EL PAGO...");
            this.next.pagoPrestamo(persona, montoAPagar);
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

}
