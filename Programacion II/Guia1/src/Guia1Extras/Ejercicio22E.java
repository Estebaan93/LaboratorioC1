/*22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio22E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int mFila, mColum, suma=0;
        System.out.println("Ingrese el tamaño de la matriz filas:");
        mFila=leer.nextInt();
        System.out.println("Ingrese el tamaño de la matriz columnas:");
        mColum=leer.nextInt();
        int [][] matriz=new int[mFila][mColum];         //Creamos la matriz 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);                  //Le asignamos hasta el 100
            }
        }
        System.out.println("Imprimimos");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma=suma+matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");
            }
               System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de sus elementos es igual a: "+suma);
        
        
    }
    
}
