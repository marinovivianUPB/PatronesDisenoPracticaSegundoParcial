package patronesdisenosegundoparcial.ejercicio6;

public class Desarrollador implements Persona{

    private String nombre;
    private String ci;
    private String tipo;

    protected ICanalComunicacion canalComunicacion;

    

    public ICanalComunicacion getCanalComunicacion() {
        return canalComunicacion;
    }


    public Desarrollador setCanalComunicacion(ICanalComunicacion canalComunicacion) {
        this.canalComunicacion = canalComunicacion;
        return this;
    }


    public Desarrollador(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
        tipo = "developer";
    }


    @Override
    public String getTipo() {
        return tipo;
    }




    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public String getCi() {
        return ci;
    }




    public void setCi(String ci) {
        this.ci = ci;
    }


    @Override
    public void show(){
        System.out.println("..............DESARROLLADOR.................");
        System.out.println("Nombre: "+nombre+" CI: "+ci);
    }


    @Override
    public void recibirMensaje(String mensaje) {
        show();
        System.out.println("NOTIFICACION: \n"+mensaje);
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ci == null) ? 0 : ci.hashCode());
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
        Desarrollador other = (Desarrollador) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (ci == null) {
            if (other.ci != null)
                return false;
        } else if (!ci.equals(other.ci))
            return false;
        return true;
    }

    
    
}
