package patronesdisenosegundoparcial.ejercicio3Strategy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Muchos implements IBuscador{

    Map<String, Celular> celularesModelo = new HashMap<>();
    Map<Celular, Double> celularesPrecio = new HashMap<>();

    @Override
    public void constructor(List<Celular> celulares) {
        for(Celular aux: celulares){
            if(!celularesModelo.containsValue(aux)){
                celularesModelo.put(aux.getModelo(), aux);
            }

            if(!celularesPrecio.containsKey(aux)){
                celularesPrecio.put(aux, aux.getPrecio());
            }
        }
    }

    @Override
    public Celular buscar(List<Celular> celulares, String modelo) {
        return celularesModelo.get(modelo);
    }

    @Override
    public List<Celular> buscar(List<Celular> celulares, double precio) {
        return celularesPrecio.keySet().stream().filter(a -> a.getPrecio() <= precio).toList();
    }

    @Override
    public  List<Celular> buscar(List<Celular> celulares, String modelo, double precio) {
        return celularesModelo.values().stream().filter(a -> a.getPrecio() <= precio && a.getModelo().toLowerCase().equals(modelo.toLowerCase())).toList();
    }

    
}
