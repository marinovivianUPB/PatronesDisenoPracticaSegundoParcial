package patronesdisenosegundoparcial.ejercicio7;

public class Persona implements IPrestamo{
    private String nombre;
    private String ci; 
    private double prestamoOriginal;
    private double porcentajePagado;
    private double montoPagado;

    

    
    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("--------------------------------RECIBIENDO MENSAJE------------------------------------");
        System.out.println(mensaje);
        this.show();
    }

    public void show(){
        System.out.println("---------------------------------PRESTAMO-----------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
        System.out.println("Porcentaje Pagado: "+porcentajePagado);
    }

    public Persona(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
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
    public double getPrestamoOriginal() {
        return prestamoOriginal;
    }
    public Persona setPrestamoOriginal(double prestamoOriginal) {
        this.prestamoOriginal = prestamoOriginal;
        return this;
    }
    public double getPorcentajePagado() {
        return porcentajePagado;
    }
    public void setPorcentajePagado(double porcentajePagado) {
        this.porcentajePagado = porcentajePagado;
    }
    public double getMontoPagado() {
        return montoPagado;
    }
    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public void anadirAMontoPagado(double montoAPagar){
        this.montoPagado = this.montoPagado+montoAPagar;
        setPorcentajePagado(100*this.montoPagado/this.prestamoOriginal);
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
        Persona other = (Persona) obj;
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
