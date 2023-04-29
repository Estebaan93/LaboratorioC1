/*1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.
 */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio1E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");                                                                            //Declaramos el Scanner leer de manera global

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int minutos, dia, hora;

        System.out.println("Ingrese los minutos a convertir");
        minutos = leer.nextInt();                                                                                                                //Leemos los minutos

        dia = minutos / 1440;                                                                                                                    //Hacemos la formula para los dias
        hora = (minutos - (1440 * dia)) / 60;                                                                                          //Formula para las horas
        System.out.println(dia + " dia, " + hora + " hora");                                                                    //Concatenamos

    }

}
