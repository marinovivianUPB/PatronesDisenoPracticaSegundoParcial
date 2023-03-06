package patronesdisenosegundoparcial.ejercicio3Strategy;

import java.util.ArrayList;
import java.util.List;

public class Pocos implements IBuscador{

    

    @Override
    public void constructor(List<Celular> celulares) {

    }

    @Override
    public Celular buscar(List<Celular> celulares, String modelo) {
        for(Celular aux : celulares){
            if(aux.getModelo().toLowerCase().equals(modelo.toLowerCase())){
                return aux;
            }
        }
        return null;
    }

    @Override
    public List<Celular> buscar(List<Celular> celulares, double precio) {
        List<Celular> aux = new ArrayList<>();
        for(Celular aux2 : celulares){
            if(aux2.getPrecio() <= precio){
                aux.add(aux2);
            }
        }
        return aux;
    }

    @Override
    public  List<Celular> buscar(List<Celular> celulares, String modelo, double precio) {
        List<Celular> aux = new ArrayList<>();
        for(Celular aux2 : celulares){
            if(aux2.getPrecio() == precio && aux2.getModelo().toLowerCase().equals(modelo.toLowerCase())){
                aux.add(aux2);
            }
        }
        return aux;
    }

    
    
}
