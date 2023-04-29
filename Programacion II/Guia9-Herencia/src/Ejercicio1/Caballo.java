/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Esteban
 */
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }


    @Override
    public void alimentarse() {
        System.out.println("El caballo "+ getNombre()+ " se alimenta de "+getAlimento());
    }
  
    
    
    
}
