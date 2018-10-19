/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author USRSIG
 */
public class Estudiante extends Persona {
    
    private int numUnico;
    private String correo;

    public Estudiante() {
    }

    public Estudiante(int numUnico, String correo) {
        this.numUnico = numUnico;
        this.correo = correo;
    }

    public Estudiante(String cedula, String nombre, String apellido, String genero, String direccion, int edad,int numUnico, String correo) {
        super(cedula, nombre, apellido, genero, direccion, edad);
        this.numUnico = numUnico;
        this.correo = correo;
    }

   

    
    public int getNumUnico() {
        return numUnico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNumUnico(int numUnico) {
        this.numUnico = numUnico;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return super.toString()+
               "\nnumUnico =" + numUnico + 
                "\ncorreo  =" + correo;
    }
    
    
    
    
    
}
