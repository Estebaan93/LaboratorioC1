/* 9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de
8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
*/
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        String frase;                                                       //Variable frase que me guarda la cadena
        int num_carac;                                                 //Me va a guardar la longitud de la cadena
        
        //Le pedimos la frase al usuario
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();                                              //Guardamos en la variable .nexLine() porque puede ser una frase o palabra
        
        num_carac=frase.length();                               //Se guarda la longitud
        //Condicional
        if (num_carac==8){                                          //Comparamos si es igual a 8
        System.out.println("Correcto");
    } else {
            System.out.println("Incorrecto");
        }
    
}
}
