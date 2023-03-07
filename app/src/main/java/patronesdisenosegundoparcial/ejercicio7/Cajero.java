package patronesdisenosegundoparcial.ejercicio7;

public class Cajero implements IHandler{

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
        if(persona.getPorcentajePagado() < 25){
            System.out.println("----------------------------------------------------");
            System.out.println("EL CAJERO ATENDERA EL PAGO...");

            persona.anadirAMontoPagado(montoAPagar);
            System.out.println("EL PAGO SE HA REALIZADO CON EXITO...");
        
            persona.show();

            if(persona.getPorcentajePagado()==100){
                this.next.pagoPrestamo(persona, 0);
            }

        } else{
            System.out.println("----------------------------------------------------");
            System.out.println("EL CAJERO NO PUEDE ATENDER EL PAGO...");
            this.next.pagoPrestamo(persona, montoAPagar);
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }
    
}
