/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpi2e_semana07;

/**
 *
 * @author SAMIR ARELLANO
 */
public class Cliente extends Persona{
    private String categoria;
    private String codigo;

    public Cliente() {
    }

    public Cliente(String categoria, String codigo) {
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public Cliente(String categoria, String codigo, String nombre, String apellidos, String documento, int tipoDeDocumento) {
        super(nombre, apellidos, documento, tipoDeDocumento);
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "categoria=" + categoria + ", codigo=" + codigo + '}';
    }
    
    
    
    
}
