/*10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre
0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java. */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio10E {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int n1, n2, resul, resp;
        char salir;                                              
        n1 = (int) (Math.random() * 11);                //Generamos aleatorio hasta el 10, primro convertimos a integer
        n2 = (int) (Math.random() * 11);                //Generamos aleatorio hasta el 10, primro convertimos a integer
        resul = n1 * n2;                                                     //Multiplicamos ambas variables
        System.out.println("Se generaron 2 numeros aleatorios y se multiplicaron entre si");
        do {
            System.out.println("Adivine el resultado desde el 0 a 100!!");
            resp = leer.nextInt();                                                  //Guardamos la respuesta del usuario
            if (resul == resp) {                                                      //La comparamos con el resultado 
                System.out.println("GENIAL!!!! ADIVINASTE EL NUMERO");
                System.out.println(resul);                                  //Si es correcto se imprime el resultado
                break;                                                                      //Si se cumple la condicion abandona el bucle
            } else {
                System.out.println("No adivinaste! MALA SUERTE");
                System.out.println("Desea intentar nuevamente? S/N");               //Le preguntamos si desea intentar de nuevo
                salir = leer.next().toUpperCase().charAt(0);                                     //Convertimos a mayusculas, y tomamos la primer letra
            }
        } while (salir == 'S');                                                                                 //Comparamos si desea continuar o salir

    }

}
