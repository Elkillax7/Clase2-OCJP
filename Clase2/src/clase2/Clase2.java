/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

//aqui vna imports

import javax.swing.JOptionPane;

public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona personaAux = new Persona();
        
        personaAux.setNombre("Alexis");
        personaAux.setApellido("Guerrero");
        
       // JOptionPane.showMessageDialog(null, personaAux.getApellido(), null, JOptionPane.PLAIN_MESSAGE,null);
        
        Persona personaAux2 = new Persona(personaAux.getNombre(),personaAux.getApellido());
       // JOptionPane.showMessageDialog(null, personaAux2.toString(), null, JOptionPane.PLAIN_MESSAGE,null);
        
        Estudiante est = new Estudiante();
        est.setSemestre("tercero");
        
        Estudiante est2 = new Estudiante(personaAux2.getNombre(), personaAux2.getApellido(),est.getSemestre());
        
        //JOptionPane.showMessageDialog(null, est2.toString(), null, JOptionPane.PLAIN_MESSAGE,null);
        
        Guitarra gui = new Guitarra(){
            
            @Override
            public void tocar(){
                throw new UnsupportedOperationException("NOT YE");
            }
            
            @Override 
            public void afinar(){
                throw new UnsupportedOperationException("NOT YET");
            }
        };
        
        JOptionPane.showMessageDialog(null, gui.tipoInstrumento(), null, JOptionPane.PLAIN_MESSAGE,null);
        
        
        
        
        
    }
    
}