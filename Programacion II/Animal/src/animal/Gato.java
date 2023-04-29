/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Esteban
 */
public class Gato extends Cuadrupedo {

    public Gato(String raza, int edad) {
        super(raza, edad);
    }

    @Override
    public void mover() {
        System.out.println("Moviendo como gato");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo como gato");
    }
    
    
    
}
