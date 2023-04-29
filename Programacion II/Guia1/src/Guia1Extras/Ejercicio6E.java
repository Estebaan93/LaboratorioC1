/*6. Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general */
package Guia1Extras;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio6E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double promedioInferior, sumaPromedioInferior = 0, promedioGeneral = 0;
        int tam, j = 0;
        System.out.println("Cuantas personas va guardar?");
        tam = leer.nextInt();
        double[] vector = new double[tam];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            vector[i] = leer.nextDouble();
        }
        System.out.println("");
        //Sacamos el promedio inferior a 1,6
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 1.6) {
                j++;                                                                                                                     //Me acumula la cantidad < 1,6                
               sumaPromedioInferior = sumaPromedioInferior + vector[i];                 //Sumamos los indices < 1,6 
            } 
            promedioGeneral = Arrays.stream(vector).sum() / vector.length;          //Otra forma de sumar los indices de un array
        }
        promedioInferior=sumaPromedioInferior/j;
        System.out.println("El promedio de estatura inferior a 1,6 mts es: " + promedioInferior);
        System.out.println("El promedio general es: " + promedioGeneral);

    }

}
