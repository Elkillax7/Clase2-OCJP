/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wraper;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i2 = Integer.valueOf("101",2);
        System.out.println(i2);
        
        
        Integer i3 = Integer.valueOf(2);
        System.out.println(i3);
        
        
        byte b=i2.byteValue();
        short s = i2.shortValue();
        System.out.println(i2+"-"+b+"-"+s);
        
        Integer i4 = 1000;
        Integer i5 = 1000;
        
        if (i4==i5){//ESTO DICE TANTO EL OBJETO i1 con i2 son le mismo objeto,
            JOptionPane.showMessageDialog(null, "OBJETOS IGUALES");
        }
        
        if(i4.equals(i5)){
            JOptionPane.showMessageDialog(null, "iguales");
        }
        
        
        String cadena = "hola";
        JOptionPane.showMessageDialog(null, cadena);
        
        
        cadena = null;
        JOptionPane.showMessageDialog(null, cadena);
        
        String cadena1 = "";
        
        Runtime rt = Runtime.getRuntime();
        
        System.err.println("MEMORIA TOTAL DE LA JVM"+rt.totalMemory());
        System.err.println("MEMORia antes de procesar"+rt.totalMemory());
        
        Date d = null;
        for(int i = 0; i<1000; i++){
            d = new Date();
            d=null;
        }
        
        System.err.println("MEMORIA LUEGO DE PROCESAS"+rt.freeMemory());
        rt.gc();
        System.err.println("MEMORIA LUEGO DE PROCESAR GC"+rt.freeMemory());
        
        
        
        
        
    }
    
}
