/*7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se solicitará al 
principio del programa y los números serán introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” 
y otra con el bucle “do - while”.*/
package Guia1Extras;

import static Guia1Extras.Ejercicio7E.leer;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio7E2 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0, n, max, min, suma = 0;
        double promed;
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        max = n;                                                     //Le asignamos el valor de n, para poder modificarlo durante el programa
        min = n;                                                      //Le asignamos el valor de n, para poder modificarlo durante el programa
        do {
            if (n > max) {
                max = n;                                            //Si se cumple se le asigna el valor max
            }
            if (n < min) {
                min = n;                                          //Si se cumple se le asigna el valor min
            }
            suma = suma + n;                            //Suma de todos los numeros para el promedio
            i++;                                                //Centinela para ver cuantas vueltas da el bucle, y sacar el promedio
            System.out.println("Ingrese otro numero");
            n = leer.nextInt();                                                           //Pedimos nuevamente el valor de n
        } while (n > 0);                                                                    //Miestras se cumpla, vuelve entrar en el bucle
        promed = suma / i;                                                              //Sacamos el promedio
        System.out.println("El valor maximo es: " + max);             //Concatenamos
        System.out.println("El valor minimo es: " + min);                 //Concatenamos
        System.out.println("El promedio es: " + promed);                 //Concatenamos
        
        
    }

}


