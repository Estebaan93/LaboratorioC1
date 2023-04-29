/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. Nota: investigar la función 
toUpperCase() y toLowerCase() en Java.
 */
package Guia1_Ej_1A5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos la variable Scanner y String (cadena)
         Scanner leer = new Scanner(System.in);
         String frase;
         
         //Le pedimos al usuario que ingrese una frase, para luego convertirla en mayuscula y minuscula
         System.out.println("Ingrese una frase");
         
         //Guardamos la frase en la variable
         frase=leer.nextLine();
         
         //Mostramos por pantalla la frase
         System.out.println("La frase en en minuscula es: "+frase.toLowerCase());
         System.out.println("La frase en mayuscula es: "+frase.toUpperCase());
    }
    
}
