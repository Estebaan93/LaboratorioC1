/*8. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará 
un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);                                         //Agregamos la variable leer de Scanner
        String frase;                                                                                       //Creamos la varoable frase
        
        System.out.println("Ingrese una frase");
        frase=leer.next();
        /*==Compara Objetos
        equals compara Cadenas
        */
        
        //Condicional 
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
