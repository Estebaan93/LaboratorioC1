/*5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La  computadora debe generar un número aleatorio entre 1 y 500, y 
el usuario tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora 
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe 
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario 
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el carácter 
fallido como un intento. */
package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio5 {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int numAleatorio;
        numAleatorio=(int)(Math.random()*5+1);                //Aleatorio entre 1 y 500
        System.out.println(numAleatorio);
        
        
        
            }
    
}
