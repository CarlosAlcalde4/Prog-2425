package unidad07_A05;


public class Gestor {
    public String nombre;
    private final String telefono;
    double maximo;
    
    Gestor(String nombre,String telefono){
        this(nombre,telefono,10000.0);

    }
    Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.maximo = importeMax;
    }
    public String getTelefono(){
        return telefono;
    }
}
