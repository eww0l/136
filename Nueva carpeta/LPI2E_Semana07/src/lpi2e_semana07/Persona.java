/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpi2e_semana07;

/**
 *
 * @author SAMIR ARELLANO
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String documento;
    private int tipoDeDocumento;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String documento, int tipoDeDocumento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(int tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", documento=" + documento + ", tipoDeDocumento=" + tipoDeDocumento + '}';
    }
    
    
}
