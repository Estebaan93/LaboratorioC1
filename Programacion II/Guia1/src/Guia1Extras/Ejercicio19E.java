/*19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte 
alguna diferencia entre los elementos). */
package Guia1Extras;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio19E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        boolean datosRepetidos=false;
        System.out.println("Ingrese el tamaño de los vectores:");
        int tam=leer.nextInt();
        int vector1[]=new int [tam];
        int vector2[]=new int [tam];
        System.out.println("Llenamos el primer vector");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese los valores para el indice "+(i+1));
            vector1[i]=leer.nextInt();
        }
        System.out.println("Llenamos el segundo vector");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i]=leer.nextInt();
        }
        System.out.println("MOSTRAMOS AMBOS VECTORES");
        for (int i = 0; i < tam; i++) {
            System.out.print("["+vector1[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            System.out.print("["+vector2[i]+"]");
        }
        System.out.println("");
          /*  for (int j = 0; j < vector1.length; j++) {
                for (int k = 0; k < vector2.length; k++) {
                    if (vector1[j]==vector2[k]) {
                        datosRepetidos=true;                        //El brak detiene la ejecucion del bucle
                        break;
                    }
                }
            }
            System.out.println("");
           
          System.out.println(datosRepetidos);*/
             if (Arrays.equals(vector1, vector2)) {
                 System.out.println("SON IGUALES");
        } else{
                 System.out.println("NO IGUALES");
             }
    }
    
}
