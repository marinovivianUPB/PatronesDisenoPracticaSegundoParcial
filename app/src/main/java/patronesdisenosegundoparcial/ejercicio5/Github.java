package patronesdisenosegundoparcial.ejercicio5;


import java.util.HashMap;
import java.util.Map;

public class Github {
    private Map<String, Memento> commits = new HashMap<>();
    

    public void createCommit(Memento memento){
        commits.put(memento.getHash(), memento);
    }

    public Memento getCommit(String hash){

        try{
            return commits.get(hash);

        } catch (Exception e){
            System.out.println("NO EXISTE EL COMMIT");
            return null;
        }

    }

    

    
}
