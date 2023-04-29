/*17. Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos 
indique si es o no un número primo, debe devolver true si es primo, sino false. Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio17E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int n;
        System.out.println("Ingrese un numero:");
        n=leer.nextInt();
     
        System.out.println(verificar(n));
        
    }
    
    public static boolean verificar(int n){
        if (n%2==0) {                               //Revisa si n es multiplo de 2
            return false;
        }
        for (int i = 3; i*i <= n; i+=2) {       //Si no solo revisa los impares
            if (n%i==0) {
                return false;
            }
        }
        return true;
    } 
    
    
}
