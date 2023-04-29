/*24. Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci 
es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3), Y así sucesivamente… La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y que calcule 
la serie hasta llegar a ese valor. Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
https://quantdare.com/numeros-de-fibonacci/ */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio24E {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int vector[]=new int[10];               //Vector de 10 elementos
        /*int n1 = 0, n2 = 1, suma = 1;
        System.out.println("Sucecion de Fibonacci");
        System.out.println(n1);
        for (int i = 0; i < 10; i++) {
            //Suma
            System.out.println(suma);
            //Primero sumamos
            suma = n1 + n2;
            //Cambiamos la segundo variable por la primera
            n1 = n2;
            //Cambiamos la suma, por la segunda variable
            n2 = suma;
        }*/

        for (int i = 0; i < vector.length; i++) {
            //System.out.println(fibonacciRecursivo(i));
            vector[i]=fibonacciRecursivo(i);
        }
        System.out.println("Imprimimos el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
        }

    }
   /**
         * Devuelve el numero fibonacci dado su posicion
         *
         * @param n Posicion del numero fibonacci
         * @return Numero de la lista de fibonacci
         */
    public static int fibonacciRecursivo(int n) {

        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tambien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }

    }
}
