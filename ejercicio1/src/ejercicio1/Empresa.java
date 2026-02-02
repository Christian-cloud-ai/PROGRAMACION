package ejercicio1;

import java.util.Arrays;

public class Empresa {
    // DeclaraciÃ³n de atributos
    private Vehiculo[] vehiculosRegistrados;

    // Constructor por defecto
    public Empresa() {
        this.vehiculosRegistrados = new Vehiculo[0];
    }

    // Constructor por parÃ¡metros
    public Empresa(Vehiculo[] vehiculosRegistrados) {
        this.vehiculosRegistrados = vehiculosRegistrados;
    }
    
    // Constructor de copia
    public Empresa(Empresa e) {
        this.vehiculosRegistrados = e.vehiculosRegistrados;
    }
    
    // DeclaraciÃ³n de getters (1 por atributo)
    public Vehiculo[] getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    // DeclaraciÃ³n de setters (1 por atributo)
    public void setVehiculosRegistrados(Vehiculo[] vehiculosRegistrados) {
        this.vehiculosRegistrados = vehiculosRegistrados;
    }
    
    // DeclaraciÃ³n de mÃ©todos personalizados
    public boolean comprobarVehiculo(Vehiculo[] vR, Vehiculo v){
        for(int i=0; i < vR.length; i++){
            if(vR[i].getMatricula().equals(v.getMatricula())){
                return true;
            }
        }
        return false;
    }
    
    public void incorporarVehiculo(Vehiculo[] vR, Vehiculo v){
        if(comprobarVehiculo(vR, v) == false){
            // Aumentar espacio array
            Vehiculo[] nuevoArray = new Vehiculo[vR.length + 1];
            
            // Agregar vehiculos ya registrados
            for(int i=0; i < vR.length; i++){
                nuevoArray[i] = vR[i];
            }
            // Agregar nuevo vehiculo
            nuevoArray[nuevoArray.length - 1] = v;
            
            // Actualizar el vR
            this.vehiculosRegistrados = nuevoArray;
            
            System.out.println("El vehiculo de matricula " + v.getMatricula() + " ha sido registrado correctamente");
        }else{
            System.out.println("El vehÃ­culo ya previamente esta registrado.");
        }
    }
          
    public void alquilarVehiculo(Vehiculo[] vR, Vehiculo v){
        if(comprobarVehiculo(vR, v) && v.isCocheDisponible()){
            v.setCocheDisponible(false);
            System.out.println("Vehiculo alquilado exitosamente.");
        } else{
            System.out.println("El vehiculo no esta disponible");
        }
    }


    // DeclaraciÃ³n toString() (con @Override)
    @Override
    public String toString() {
        return "Empresa{" + "vehiculosRegistrados=" + Arrays.toString(vehiculosRegistrados) + '}';
    }
    
}