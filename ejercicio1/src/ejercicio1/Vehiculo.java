package ejercicio1;
public class Vehiculo {
    
// DeclaraciÃ³n de atributos
    private String matricula;
    private String marca;
    private String modelo;
    private boolean cocheDisponible;
    
// Constructor por defecto

    public Vehiculo() {
        this.matricula = "";
        this.marca = "";
        this.modelo = "";
        this.cocheDisponible = true;
    }
    
// Constructor por parÃ¡metros
    public Vehiculo(String matricula, String marca, String modelo, boolean cocheDisponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cocheDisponible = cocheDisponible;
    }
    
// Constructor de copia
    public Vehiculo(Vehiculo v){
        this.matricula = v.matricula;
        this.marca = v.marca;
        this.modelo = v.modelo;
        this.cocheDisponible = v.cocheDisponible;
        
        //if(v.)
    }
    
// DeclaraciÃ³n de getters (1 por atributo)
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isCocheDisponible() {
        return cocheDisponible;
    }
    
// DeclaraciÃ³n de setters (1 por atributo)
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCocheDisponible(boolean cocheDisponible) {
        this.cocheDisponible = cocheDisponible;
    }
    
// DeclaraciÃ³n de mÃ©todos personalizados
    
    
// DeclaraciÃ³n toString() (con @Override)
    @Override
    public String toString() {
        String cadena = "Matricula: " + matricula +
                        ", Marca: " + marca +
                        ", Modelo: " + modelo +
                        ", Disponible: ";

        if (cocheDisponible) {
            cadena += "Si";
        } else {
            cadena += "No";
        }

        return cadena;
        }
}