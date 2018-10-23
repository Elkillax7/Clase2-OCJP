/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesFracciones;

/**
 *
 * @author Alexis
 */
public class Racional {
    
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 0;
        this.denominador=0;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    private int mcd_euclides(){
        int a,b;
        
        a = Math.abs(numerador);
        b = Math.abs(denominador);
        
        if(b==0){
            return a;
        }
        
        int c;
        while(b != 0){
            c = a%b;
            a = b;
            b = c;
            
        }
        
        return a;
        
    }
    
    public Racional Simplificar(){
        int mcd = mcd_euclides();
        numerador = numerador/mcd;
        denominador = denominador/mcd;
        return this;
    }
    
    public Racional suma (Racional racional1, Racional racional2){
        Racional racionalAux = new Racional(
        racional1.numerador*racional2.denominador+
                racional2.numerador*racional1.denominador,
        racional1.denominador*racional2.denominador);
        
        racionalAux.Simplificar();
        
        return racionalAux;
    }
    
    
    public Racional restar (Racional racional1, Racional racional2){
        Racional racionalAux = new Racional(
        racional1.numerador*racional2.denominador - racional2.numerador*racional1.denominador,
        racional1.denominador*racional2.denominador);
        
        racionalAux.Simplificar();
        
        return racionalAux;
    }
    
    public Racional multiplicar(Racional racional1, Racional racional2){
        Racional racionalAux = new Racional(
        racional1.numerador*racional2.numerador, racional1.denominador*racional2.denominador);
        racionalAux.Simplificar();
        return racionalAux;
    }
    
    public Racional dividir(Racional racional1, Racional racional2){
        Racional racionalAux = new Racional(
        racional1.numerador*racional2.numerador, racional2.denominador*racional1.denominador);
        racionalAux.Simplificar();
        return racionalAux;
    }
    
    
    
    
    
    
    

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
    
    
    
    
}
