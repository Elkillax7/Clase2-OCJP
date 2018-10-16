/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class AplicacionAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String placaAux, colorAux, marcaAux;
        
        placaAux = JOptionPane.showInputDialog("Ingrese la placa");
        colorAux = JOptionPane.showInputDialog("Ingrese el color del auto");
        marcaAux = JOptionPane.showInputDialog("Ingrese la marca del auto");
        
        Auto auto = new Auto();
        auto.setPlaca(placaAux);
        auto.setColor(colorAux);
        auto.setMarca(marcaAux);
        
        JOptionPane.showMessageDialog(null, auto.toString());
        
        FormAuto autoFormulario = new FormAuto(null, true);
        autoFormulario.setVisible(true);

    }

}
