package patronesdisenosegundoparcial.ejercicio1Memento;

public class EditorDeTexto {
    private Tesis tesis;

    public void setTesis(Tesis tesis){
        System.out.println("TESIS LISTA PARA SER GUARDADA...");
        this.tesis = tesis;
    }

    public Memento createMemento(String fecha){
        return new Memento(tesis, fecha);
    }

    public void recuperarTesis(Memento memento){
        this.tesis = memento.getTesis();
        System.out.println("SE RECUPERO LA TESIS DE: "+memento.getFecha()+"--------------------------------------------------------------");
        this.tesis.show();
    }
}
