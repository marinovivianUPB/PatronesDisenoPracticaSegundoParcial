package patronesdisenosegundoparcial.ejercicio7;

public class Supervisor implements IHandler{

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

        if(persona.getPorcentajePagado()==100){
            this.next.pagoPrestamo(persona, 0);
        } else if(persona.getPorcentajePagado() > 50 && persona.getPorcentajePagado() < 100){
            System.out.println("----------------------------------------------------");
            System.out.println("EL SUPERVISOR ATENDERA EL PAGO...");

            persona.anadirAMontoPagado(montoAPagar);
            System.out.println("EL PAGO SE HA REALIZADO CON EXITO...");

            banco.send("PODEMOS OFRECERLE NUEVOS PRESTAMOS", persona);

            if(persona.getPorcentajePagado()==100){
                this.next.pagoPrestamo(persona, 0);
            }

        } else{
            System.out.println("----------------------------------------------------");
            System.out.println("EL SUPERVISOR NO PUEDE ATENDER EL PAGO...");
            this.next.pagoPrestamo(persona, montoAPagar);
        }
        
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

}
    
