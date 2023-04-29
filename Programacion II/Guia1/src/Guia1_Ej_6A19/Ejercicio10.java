/*10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
.
 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        String frase;                                                  //Creamos la variable que guardara la cadena
        boolean letra;                                              //boolean que me dira si es F o T
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();                                                             //Se guarda la cadena
        
                                                                                                              //equals me devuelve F o T, debia ser de forma boolean
        letra=frase.substring(0,1).equals("A");                              //Guardamos la primera letra y la comparamos con la "A"
                                                                                                            
        //Condicional para comparar
        if (letra) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
