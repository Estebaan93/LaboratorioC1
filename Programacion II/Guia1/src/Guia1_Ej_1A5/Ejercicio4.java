/*
 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9 * C / 5).
 */
package Guia1_Ej_1A5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);                      //Agregamos la variable Scanner para lectura de entrada de datos a leer
        int C, F;                                                                                //Variable de tipo entero Centigrados y Fahrenheit
        
        System.out.println("Ingrese los grados Centigrados:");
        
        C=leer.nextInt();                                                               //Guardamos el valor en la variable C
        
        //Asignamos la formula a la variable F
        F = 32 + (9 * C / 5);
        System.out.println("La conversion de grados Centigrados a Fahrenheit es igual a: "+ F);         //Concatenamos
    }
    
}
