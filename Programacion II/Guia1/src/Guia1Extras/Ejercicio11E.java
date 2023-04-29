/*11. Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio11E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int n, digitos = 0;
        
        System.out.println("Ingrese un numero");
        n=leer.nextInt();
        if (n==0) {
            digitos=1;                                                                          //Si el numero es 0, tiene una cifra
        } else{
            for (int i = Math.abs(n); i > 0; i/=10) {                       // Vamos dividiendo entre 10, hasta que llegemos a 0
                digitos++;
            }
        }
        
        System.out.println("Numero de digitos: "+digitos);
        
        
    }
    
}
