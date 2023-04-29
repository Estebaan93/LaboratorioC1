/*1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer. La lectura de números 
termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el programa mostrará por pantalla el número de valores 
que se han leído, su suma y su media (promedio).*/
package Ejercicio1E;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio1E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable
        Integer num;
        //Creamos el ArrayList
        ArrayList<Integer> listaNumeros=new ArrayList();
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        while  (num!=-99){
        listaNumeros.add(num);
        num=leer.nextInt();
        }
        System.out.println("");
        System.out.println("Imprimimos");
        for (Integer aux : listaNumeros) {
            System.out.println(aux);
        }
        
        
    }
}
