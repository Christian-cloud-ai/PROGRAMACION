/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Christian
 */
public class Cuenta {
    private int numeroIdentificativo;
    private double saldoDisponible = 0;

    public Cuenta(int numeroIdentificativo, double saldoDisponible) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.saldoDisponible = saldoDisponible;
    }
    
    public Cuenta() {
        this.numeroIdentificativo = 100;
        
    }
    public Cuenta (Cuenta cue) {
        this.numeroIdentificativo = cue.numeroIdentificativo;
        this.saldoDisponible = cue.saldoDisponible;
        
                
    }
    public int getNumeroIdentificativo () {
        return this.numeroIdentificativo;
    }
    public double getSaldoDisponible () {
        return this.saldoDisponible;
    }
    public void setNumeroIdentificativo (int numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }
    public void setSaldoDisponible (double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    @Override
    public String toString () {
        return "Numero Identificativo: " + this.numeroIdentificativo + "\n" +
                "Saldo Disponible: " + this.saldoDisponible;
    }
}

    

