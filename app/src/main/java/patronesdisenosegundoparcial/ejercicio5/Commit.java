package patronesdisenosegundoparcial.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Commit {
    private List<String> codigo = new ArrayList<>();
    
    public void addCodigo(String codigo){
        this.codigo.add(codigo);
    }

    public List<String> getCodigo(){
        List<String> aux = new ArrayList<>();
        for(String aux2 : codigo){
            aux.add(aux2);
        }
        return aux;
    }

    public void setCodigo(List<String> codigo){
        this.codigo = codigo;
    }

    public void show(){
        System.out.println("-----------------------COMMIT-------------------------");
        for(String aux : codigo){
            System.out.println(aux);
        }
    }
}
