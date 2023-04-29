/*12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio12E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int a, b, c;
        String d, e, f, g = String.valueOf(3);
        
        for (a = 0; a < 10; a++) { 
            d = String.valueOf(a);                                 //Convertimos el integer a String
            d = d.replaceAll(g, "E");                               //Reemplazamos todos los 3 por las E, en el caso de d
            for (b = 0; b < 10; b++) {
                e = String.valueOf(b);                              //Convertimos el integer a String 
                e = e.replaceAll(g, "E");                          //Reemplazamos todos los 3 por las E, en el caso de la e
                for (c = 0; c < 10; c++) {
                    f = String.valueOf(c);                         //Convertimos el integer a String
                    f = f.replaceAll(g, "E");                       //Reemplazamos todos los 3 por las E , en el caso de la f
                    if (!(d.equals(g) || e.equals(g) || f.equals(g))) {                             //Si es diferente se imprime
                        System.out.println(d + "-" + e + "-" + f);
                    }
                }
            }
            System.out.println("");
        }

    }

}
