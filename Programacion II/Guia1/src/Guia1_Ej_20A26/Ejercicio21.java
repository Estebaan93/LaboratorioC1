/*21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector. El programa mostrará 
donde se encuentra el numero y si se encuentra repetido.*/
package Guia1_Ej_20A26;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner leer
        Scanner leer = new Scanner(System.in);
        int tama, buscar;                                                                                                                                                       //Variables de tipo entero
        boolean encontrado = false;                                                                                                                                  //Boolean 
        int encontr=0;

        System.out.println("Ingrese el tamaño del vector");
        tama = leer.nextInt();
        int[] vector = new int[tama];                                                                                                                                 //Dimensionamos el vector

        //Bucle for para llenado utilizando la funcion length
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 51);                                                                                                          //Aleatorio hasta 50
        }

        System.out.println("Ingrese el valor a buscar en el vector");
        buscar = leer.nextInt();                                                                                                                                          //Guardamos el valor que queremos buscar

        //Bucle for para buscar el valor que se desea utilizando tamaño(sin funcion length) ambos casos funcionan
        for (int i = 0; i < tama; i++) {
            if (buscar == vector[i]) {
                System.out.println("El valor " + buscar + " esta en el indice " + i);                                                         //Concatenamos
                encontrado = true;
                encontr++;
            }
        }
        //Condicional
        if (encontrado) {
            if (encontr>1) {
                System.out.println("El numero se encontro mas de una vez en el vector");                                        //Si se encuentra mas de una vez
            }
        } else {
            System.out.println("El numero no se encuentra en el vector");                                                               //Si no se encuentra se imprime
        }
        System.out.println("");

        //Bucle for para imprimir el vector
        for (int i = 0; i < tama; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
