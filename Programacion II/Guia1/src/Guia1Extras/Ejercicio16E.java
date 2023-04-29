/*16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por
teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra */
package Guia1Extras;

import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio16E {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  System.out.println(pedir());
        pedir();
        
      }
    
    public static boolean pedir() {
        boolean mayor=false;
        char salir;
        do {
        System.out.println("Ingrese el nombre:");
        String nombre=leer.next();
        System.out.println("Ingrese la edad:");
        int edad=leer.nextInt();
        if (edad>18) {
            System.out.println(nombre+" es mayor de edad con "+edad+" años");
            mayor=true;
        } else{
            System.out.println(nombre+ " es menor de edad con "+edad+" años");
            mayor=false;
        }
            System.out.println("");
            System.out.println("Desea seguir? S/N");
            salir=leer.next().toUpperCase().charAt(0);
        } while (salir=='S');
        
        return mayor ;
    }
   
    
}
