package patronesdisenosegundoparcial.ejercicio1Memento;

public class Client {
    public static void main(String[] args) {
        EditorDeTexto word = new EditorDeTexto();
        Computadora compu = new Computadora();

        Tesis tesis = new Tesis("62124", "Milan Raich");
    
        tesis.addTexto("Primera Linea");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("1.1.23"));

        tesis.addTexto("Segunda Linea");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("1.2.23"));

        tesis.addTexto("Tercera Linea");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("1.3.23"));

        tesis.addTexto("Cuarta Linea");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("1.4.23"));

        tesis.addTexto("Quinta Linea");
        word.setTesis(tesis);
        compu.addVersionTesis(word.createMemento("1.5.23"));

        tesis.show();

        
        tesis = word.recuperarTesis(compu.getTesis("1.3.23"));

        tesis.show();

    }
}
