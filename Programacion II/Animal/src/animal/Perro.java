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
public class Perro extends Cuadrupedo{
    
    private boolean collar;

    public Perro( String raza, int edad, boolean collar) {
        super(raza, edad);
        this.collar = collar;
    }
    
    
    @Override
    public void mover(){
        System.out.println("Moviendo como perro");
    }
    
    @Override
    public void comer(){
        System.out.println("Comiendo como perro");
    }
    
    
        
   
}
