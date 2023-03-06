package patronesdisenosegundoparcial.ejercicio5;

public class Memento {
    private Commit commit;
    private String descripcion;
    private String fecha;
    private String hash;

    public Memento(Commit commit, String descripcion, String fecha, String hash) {
        this.commit = commit;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hash = hash;
    }

    public Commit getCommit() {
        return commit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHash() {
        return hash;
    }

    
    
    
}
