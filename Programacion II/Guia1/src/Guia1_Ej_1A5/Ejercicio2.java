/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package Guia1_Ej_1A5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos la variable Scanner y String (cadena)
         Scanner leer = new Scanner(System.in);
         String nombre;
        
        //Mostramos por pantalla el mensaje
        System.out.println("Ingrese su nombre");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //Mostramos por pantalla el nombre
        System.out.println("Mi nombre es "+nombre);
    }
    
}
