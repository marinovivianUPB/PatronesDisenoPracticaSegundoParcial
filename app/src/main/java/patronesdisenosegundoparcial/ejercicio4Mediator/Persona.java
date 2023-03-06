package patronesdisenosegundoparcial.ejercicio4Mediator;

public class Persona {
    private String nombre;
    private String numero;

    protected ICanalComunicacion canalComunicacion;

    public Persona(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public ICanalComunicacion getCanalComunicacion() {
        return canalComunicacion;
    }
    public Persona setCanalComunicacion(ICanalComunicacion canalComunicacion) {
        this.canalComunicacion = canalComunicacion;
        return this;
    }

    public void show(){
        System.out.println("---------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero: "+numero);
    }

    public void send(String mensaje, Persona recipiente){
        this.canalComunicacion.send(mensaje, this, recipiente);

    }

    public void send(String mensaje){
        this.canalComunicacion.send(mensaje, this);
    }

    public void recibir(String mensaje){
        this.show();
        System.out.println("RECIBIO: "+mensaje);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((canalComunicacion == null) ? 0 : canalComunicacion.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (canalComunicacion == null) {
            if (other.canalComunicacion != null)
                return false;
        } else if (!canalComunicacion.equals(other.canalComunicacion))
            return false;
        return true;
    }

    
    
}
