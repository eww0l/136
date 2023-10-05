/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpi2e_semana07;

/**
 *
 * @author SAMIR ARELLANO
 */
public class Empleado extends Persona{
    private int tipoContrato;
    private double sueldo;

    public Empleado(int tipoContrato, double sueldo) {
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }

    public Empleado(int tipoContrato, double sueldo, String nombre, String apellidos, String documento, int tipoDeDocumento) {
        super(nombre, apellidos, documento, tipoDeDocumento);
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "tipoContrato=" + tipoContrato + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
