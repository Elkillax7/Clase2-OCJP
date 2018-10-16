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
public class Auto {
    private String placa;
    private String color;
    private String marca;

    public Auto() {
    }

    public Auto(String placa, String color, String marca) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString(){
        return "Placa : "+ this.placa + 
                "\nColor: "+ this.color + 
                "\nMarca: "+ this.marca;
    }
    
    
}
