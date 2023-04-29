/*14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para 
averiguar la media de edad de los hijos de todas las familias. */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio14E {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int numFamilias, cantHijos;
        int media;
        System.out.println("Ingrese la cantidad de familias:");
        numFamilias = leer.nextInt();
        //Creamos un vector
        int[] familias = new int[numFamilias];
        for (int i = 0; i < familias.length; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + (i + 1));
            cantHijos = leer.nextInt();
            familias[i] = cantHijos;
            
        }
        System.out.println("");
        System.out.println("Generando la media de edad..");
        for (int i = 0; i < familias.length; i++) {
            System.out.print(familias[i] + "-");
            media = (int)(Math.random()*30);
            System.out.println("Media:"+media);
        }
        System.out.println("");

    }

}
