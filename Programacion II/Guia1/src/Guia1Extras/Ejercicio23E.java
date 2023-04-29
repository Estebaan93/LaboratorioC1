/*23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras 
creada. Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random() */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio23E {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la matriz de 20x20 de tipo de cadena
        String matriz[][] = new String[3][3];
       // String vector[]=new String [10];
        String frase;
        char []letras=new char[10];
        do {
            System.out.println("Ingrese una frase de 3 a 5 caracteres");
            frase = leer.next();
        } while (!(frase.length() >= 3 && frase.length() <= 5));
            letras=frase.toCharArray();
        System.out.println(frase);
        System.out.println("");
        
        System.out.println(letras);    
        
       /*
        for (int i = 0; i < frase.length(); i++) {
           // letras=frase.charAt(i);
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j]=frase;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
       */
       
        }
        
        
        
        
    }


