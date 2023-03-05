package patronesdisenosegundoparcial.ejercicio1Memento;

import java.util.HashMap;
import java.util.Map;

public class Computadora {

    private Map<String, Memento> versionesTesis = new HashMap<>();

    public Computadora addVersionTesis(Memento memento, String fecha){
        System.out.println("GUARDANDO TESIS...");
        versionesTesis.put(fecha, memento);
        return this;
    }

    public Memento getTesis(String fecha){
        return versionesTesis.get(fecha);
    }

    public void show(){
        System.out.println("---------------------A CONTINUACION TODAS LAS VERSIONES DE TESIS---------------------");
        versionesTesis.entrySet().stream().forEach( a -> {
            System.out.println("--------------------"+a.getKey()+"------------------------------");
            a.getValue().getTesis().show();}
        );
    }
    
}
