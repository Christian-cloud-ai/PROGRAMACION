/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;



/**
 *
 * @author Christian
 */
public class Cliente {
    private Cuenta cuenta;
    
    public Cliente() {
        this.cuenta = new Cuenta();
    }
    public Cliente(Cuenta cuenta ) {
        this.cuenta = cuenta;
    }
    public Cliente(Cliente clien){
        this.cuenta = clien.cuenta;
    }
    public Cuenta getCuenta () {
        return this.cuenta;
        
    }
    public void setCuenta (Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void ingresarSaldo ( double saldoAIngresar ){
        cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + saldoAIngresar);
        
        
}
    public void retirarSaldo ( double saldoARetirar ) {
        if(saldoARetirar < cuenta.getSaldoDisponible()) {
            cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - saldoARetirar);
            
            
        }
       
               
             
    }
    public double consultarSaldo () {
        return cuenta.getSaldoDisponible();
    }
    @Override
    public String toString () {
        return "Cuenta" + this.cuenta;
    }
   
}
