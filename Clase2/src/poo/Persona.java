/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alexis
 */
public class Persona {
    
    private long cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String direccion;
    private int edad;

    public Persona() {
    }

    public Persona(long cedula, String nombre, String apellido, String genero, String direccion, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.edad = edad;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return    "   cedula    =" + this.cedula 
                + "\n nombre    =" + this.nombre  
                + "\n apellido  =" + this.apellido 
                + "\n genero    =" + this.genero 
                + "\n direccion =" + this.direccion 
                + "\n edad      =" + this.edad;
    }
    
    
    
    
}
