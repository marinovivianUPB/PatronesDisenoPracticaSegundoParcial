package patronesdisenosegundoparcial.ejercicio3Strategy;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Celular> celulares = new ArrayList<>();
    private IBuscador buscador;

    public Tienda addCelular(Celular celular){
        if(!celulares.contains(celular)){
            celulares.add(celular);
        }
        if(buscador!=null){
            buscador.constructor(celulares);
        }
        return this;
    }

    public int numeroCelulares(){
        return celulares.size();
    }

    public IBuscador getBuscador() {
        return buscador;
    }

    public void setBuscador(IBuscador buscador) {
        this.buscador = buscador;
        this.buscador.constructor(celulares);
    }

    public Celular buscar(String modelo){
        return this.buscador.buscar(this.celulares, modelo);
    }

    public List<Celular> buscar(double precio){
        return this.buscador.buscar(this.celulares, precio);
    }

    public List<Celular> buscar(double precio, String modelo){
        return this.buscador.buscar(this.celulares, modelo, precio);
    }


}
