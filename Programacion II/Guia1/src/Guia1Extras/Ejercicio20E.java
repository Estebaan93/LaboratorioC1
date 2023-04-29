/*20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra 
función o procedimiento que imprima el vector */
package Guia1Extras;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio20E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int tam;
        System.out.println("Ingrese el tamaño del vector:");
        tam = leer.nextInt();
        //Creamos el vector
        int vector[] = new int[tam];
        Llenar(vector);
        System.out.println("Imprimimos y pasamos por parametro");
        Imprimir(vector);
        System.out.println("");
       // System.out.println(Arrays.toString(Llenar(vector)));              //Usamos la utilidad de Arrays tambien, sin usar la funcion de imprimir
        System.out.println("");
    }
    //Funcion de tipo vector
    public static int[] Llenar(int vector[]) {          //Tambien podemos pasar por parametro el tamaño del vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;                                          //Devuelve el vector
    }

        public static int[] Imprimir(int vector[]) {
        int i = 0;
        for (i = 0; i < vector.length; i++) {
         System.out.print("[" + vector[i] + "]");            //Imprimimos con este sout
        }
        return vector;                                                      //Nos devuelve el vector pero hay que colocarlo dentro de un sout
    }

}
