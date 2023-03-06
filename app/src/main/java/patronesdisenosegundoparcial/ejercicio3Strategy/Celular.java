package patronesdisenosegundoparcial.ejercicio3Strategy;

public class Celular {
    private String modelo;
    private String marca;
    private String gama;
    private double precio;

    public Celular(String modelo, String marca, String gama, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getGama() {
        return gama;
    }
    public void setGama(String gama) {
        this.gama = gama;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void show(){
        System.out.println("------------------------"+modelo+"---------------------------");
        System.out.println("PRECIO: "+precio);
        System.out.println("GAMA: "+gama);
        System.out.println("MARCA: "+marca);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((gama == null) ? 0 : gama.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Celular other = (Celular) obj;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (gama == null) {
            if (other.gama != null)
                return false;
        } else if (!gama.equals(other.gama))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    } 

    
    
}
