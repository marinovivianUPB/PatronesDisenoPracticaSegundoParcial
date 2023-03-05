package patronesdisenosegundoparcial.ejercicio1Memento;

public class Tesis {
    private String texto = "";
    private String nombreEstudiante;
    private String ciEstudiante;

    

    public Tesis(String nombreEstudiante, String ciEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.ciEstudiante = ciEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCiEstudiante() {
        return ciEstudiante;
    }

    public void setCiEstudiante(String ciEstudiante) {
        this.ciEstudiante = ciEstudiante;
    }

    public String getTexto() {
        String aux = texto;
        return aux;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void addTexto(String nuevoTexto){
        this.texto = this.texto+"\n"+nuevoTexto;
    }

    public void show(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Nombre: "+nombreEstudiante);
        System.out.println("CI: "+ciEstudiante);
        System.out.println("Cuerpo: ");
        System.out.println(texto);
    }

    public Tesis clone(){
        Tesis aux = new Tesis(this.nombreEstudiante, this.ciEstudiante);
        aux.setTexto(this.texto);
        return aux;
    }

    
}
