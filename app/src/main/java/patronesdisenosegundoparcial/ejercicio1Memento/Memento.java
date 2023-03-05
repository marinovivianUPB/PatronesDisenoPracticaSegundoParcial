package patronesdisenosegundoparcial.ejercicio1Memento;

public class Memento {
    private Tesis tesis;
    private String fecha;

    public Memento(Tesis tesis, String fecha){
        this.tesis = tesis;
        this.fecha = fecha;
    }

    

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }



    public String getFecha() {
        return fecha;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public Tesis getTesis(){
        Tesis aux = new Tesis(this.tesis.getNombreEstudiante(),this.tesis.getCiEstudiante());
        aux.setTexto(this.tesis.getTexto());
        return aux;
    }
}
