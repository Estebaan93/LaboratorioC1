/*
 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el 
resultado de la suma
 */
package Guia1_Ej_1A5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea la variable para que me guarde los datos
        //int de tipo entero
        int num1, num2, suma;
        
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero A ");
        num1=leer.nextInt();         //Se guarda la variable en num1   
        System.out.println("Ingrese el numero B ");
        num2=leer.nextInt();        //Se guarda la variable en num2
        suma=num1+num2;         //Sumas de ambos numeros
        
        System.out.println("La suma de A y B es " + suma);              //Concatenamos
    }
    
}
