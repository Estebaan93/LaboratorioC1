/*3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String.*/
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio3E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");                                                               //Declaramos de manera global
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables de tipo caracter
        String letra;
        
        System.out.println("Ingrese una letra");
        letra=leer.next();
        
        if (letra.equalsIgnoreCase("A") || (letra.equalsIgnoreCase("E")) || (letra.equalsIgnoreCase("I")) || (letra.equalsIgnoreCase("O")) || (letra.equalsIgnoreCase("U"))    ) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
