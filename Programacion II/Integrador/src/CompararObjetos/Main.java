/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompararObjetos;

/**
 *
 * @author Esteban
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona();
        Persona p2= new Persona();
        
        p1.setNombre("Albus Dumbledore");                       //Seteamos el nombre a p1
        p2.setNombre(p1.getNombre());                               //Seteamos el nombre a p2 de p1 atraves del getNombre()
        System.out.println(p1.equals(p2));                          //Comparamos los objetos 
        System.out.println(p1.getNombre().equals(p2.getNombre()));                      //Comparamos los nombres
        
    }
    
}
