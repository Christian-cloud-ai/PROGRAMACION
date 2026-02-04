/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Alberto
 */
public class CentroDeportivo {
    private Registrarse[] registros;

    public CentroDeportivo() {
        this.registros = null;
    }
    public CentroDeportivo(Registrarse[] listaRegistros) {
        this.registros = listaRegistros;
    }
    public CentroDeportivo(CentroDeportivo cd) {
        if(cd.registros != null){
            this.registros = new Registrarse[cd.registros.length];
            for(int i = 0; i < cd.registros.length; i++){
                this.registros[i] = new Registrarse(cd.registros[i]);
            }
        } else {
            this.registros = null;
        }
    }

    public Registrarse[] getRegistros() {
        return registros;
    }

    public void setRegistros(Registrarse[] registros) {
        this.registros = registros;
    }

    void inscribirSocio(double importe, Socio s, Actividad a){
        Registrarse[] nuevoArray = new Registrarse[registros.length + 1];
        for (int i = 0; i < this.registros.length; i++) {
            nuevoArray[i] = this.registros[i];
        }
        nuevoArray[nuevoArray.length - 1] = new Registrarse(importe, a, s);
        registros = nuevoArray;
        
        System.out.println("Inscripción completada");
    }
    
    void consultarActividadesSocio(int id) {
        boolean encontrado = false;
        for(int i = 0; i < registros.length; i++){
            if(registros[i].getSocio().getId() == id){
                System.out.println("Actividad encontrada: " + registros[i].getActividad().toString());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro actividad para este socio");
        }
    }
    
    double calcularIngresosTotales() {
        double ingresosTotales = 0;
        
        for(int i = 0; i < registros.length; i++){
            ingresosTotales += registros[i].getImporte();
        }
        
        return ingresosTotales;
    }
    
    @Override
    public String toString() {
        String listado = "CentroDeportivo{";
        if(registros != null){
            for(int i = 0; i < registros.length; i++){
                listado += " " + registros[i].toString() + "\n";
            }
        }
        listado += " }";
        return listado;
    }
    
    
    
    
}
