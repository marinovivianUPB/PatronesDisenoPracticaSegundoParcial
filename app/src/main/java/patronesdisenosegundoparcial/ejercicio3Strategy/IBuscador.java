package patronesdisenosegundoparcial.ejercicio3Strategy;

import java.util.List;

public interface IBuscador {
    void constructor(List<Celular> celulares);
    Celular buscar(List<Celular> celulares, String modelo);
    List<Celular> buscar(List<Celular> celulares, double precio);
    List<Celular> buscar(List<Celular> celulares, String modelo, double precio);
}
