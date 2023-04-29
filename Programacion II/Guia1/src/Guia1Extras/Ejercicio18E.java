/*18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio18E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int j=0;
        
        System.out.println("Ingrese el tamaño del vector");
        int tam=leer.nextInt();
        int vector []= new int [tam];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese los valores para "+(i+1));
            vector[i]=leer.nextInt();   
        }
        System.out.println("Leemos el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
            j=j+vector[i];
        }
        System.out.println("");
        System.out.println("Sumamos sus elementos:");
        System.out.println(j);
        
        
    }
    
}
