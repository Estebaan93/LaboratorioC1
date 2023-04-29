
package Tp5_Lab1_C1;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class PruebaArreglo {
public static Scanner leer= new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int arreglo[][]= {{10,9,1,13},{5,4,3},{1,12}};
        System.out.println("Ingrese el tamaño del array:");
        n=leer.nextInt();
        int vector[]= new int [n];
        Arreglo.sumarLista(vector);
        System.out.println("Arreglo irregular");
        System.out.println(Arreglo.buscarMayor(arreglo));
        
    }
    
    
}
