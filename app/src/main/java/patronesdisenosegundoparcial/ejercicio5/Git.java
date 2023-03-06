package patronesdisenosegundoparcial.ejercicio5;

import java.util.ArrayList;

import java.util.List;

public class Git implements IRepositorio{
    private Commit commit;
    private List<Desarrollador> developers = new ArrayList<>();

    public void setCommit(Commit commit){
        this.commit = new Commit();
        this.commit.setCodigo(commit.getCodigo());
        System.out.println("CREANDO NUEVO COMMIT........");
    }

    public Memento crearMemento(String fecha, String descripcion, String hash){
        return new Memento(commit, descripcion, fecha, hash);
    }

    public Commit recuperarCommit(Memento memento){
        this.commit = memento.getCommit();
        System.out.println("RECUPERANDO COMMIT: "+memento.getFecha()+" DESCRIPCION: "+memento.getDescripcion());
        notificar("SE RECUPERO EL COMMIT: "+memento.getHash()+" DEL DIA: "+memento.getFecha()+" DESCRIPCION: "+memento.getDescripcion());
        return this.commit;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("--------------NOTIFICANDO A DESARROLLADORES--------------------");
        this.developers.stream().forEach(a -> a.recibirNotificacion(mensaje));
        
    }

    @Override
    public IRepositorio quitarSuscripcion(Desarrollador desarrolador) {
        this.developers.remove(desarrolador);
        return this;
    }

    @Override
    public IRepositorio suscribir(Desarrollador desarrollador) {
        this.developers.add(desarrollador);
        return this;
    }
}
