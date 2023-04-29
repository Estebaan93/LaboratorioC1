/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarryPotter;

/**
 *
 * @author Esteban
 */
public class HarryPotter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los objetos
        Wizard mago=new Wizard("Harry Potter");
        Wizard maga=new Wizard("Hermione Granger", "Alohomora");
                
         mago.sayName();        //Nombre de Harry Potter
         maga.castSpell();      //Hechizo de Hermione
         mago.castSpell();      //Null porque Harry Potter no recibe hechizo por parametros
                
         //Se imprime Harry Potter Alohomora null
         
    }
    
}
