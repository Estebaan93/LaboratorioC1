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
public class Rectangulo implements calculosFormas{
    //Atributos
    private Double altura;
    private Double base;
    
    //Constructores
    public Rectangulo() {               //Constructor vacio
    }
    public Rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }
    
    //Get & Set
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    
    
    
    //Metodos
    
    @Override
    public Double calcularArea() {
        Double area= getBase().doubleValue()*getAltura().doubleValue();
        return area;
    }

    @Override
    public Double calculaPerimetro() {
        Double perimetro= (getBase().doubleValue()+getAltura().doubleValue());
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + getAltura().toString() + ", base=" + getBase().toString() + '}';
    }

    
    
}
