/*13. Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123 */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio13E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int altura, a, b;
        System.out.println("Ingrese la altura de la escalera");
        altura = leer.nextInt();
        System.out.println("");
        //Creamos la matriz
        int[][] escalera = new int[altura][altura];             //Dimensionamos la matriz
        while (altura >= 0) {                                                  
            altura--;
                for (int j = 0; j < altura+1; j++) {
                      escalera[altura][j] = j + 1;
                }
        }
        System.out.println("Imprimimos la escalera");
            for (int j = 0; j < escalera.length; j++) {
                for (int i = 0; i < escalera[j].length; i++) {
                    if (escalera[j][i] !=0) {
                    System.out.print(escalera[j][i]);    
                    }
                }
                System.out.println("");
            }
        
        
    }

}
