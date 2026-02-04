package ejercicio10;

public class Socio {
    private String nombre;
    private int id;

    public Socio() {
        this.nombre = "";
        this.id = 0;
    }

    public Socio(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public Socio(Socio s1){
        this.nombre = s1.nombre;
        this.id = s1.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    
    
}
