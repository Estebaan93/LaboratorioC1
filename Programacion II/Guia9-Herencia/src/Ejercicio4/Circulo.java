/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Esteban
 */
public class Circulo implements calculosFormas{
    //Atributos
    private Double radio;

    //Constructores
    public Circulo(){       //Constructor vacio  
    }
    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    //Get & Set
    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {    
        this.radio = radio;
    }

    //Metodos 
    @Override
    public Double calcularArea() {
        Double area=VALOR_PI* getRadio().doubleValue() * getRadio().doubleValue();
        return area;
    }

    @Override
    public Double calculaPerimetro() {
        Double perimetro= VALOR_PI* (2*getRadio().doubleValue());
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + getRadio().toString()+ '}';
    }
    
    
    
}
