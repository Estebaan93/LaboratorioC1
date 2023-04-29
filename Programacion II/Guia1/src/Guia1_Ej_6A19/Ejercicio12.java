/*Bucles y sentencias de salto break y continue 
12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. 
.*/
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner leer=new Scanner(System.in);
        int nota;                                                                                   //Variable de tipo entero
        
        System.out.println("Ingrese una nota:");
        nota=leer.nextInt();                                                                //Leemos la nota
        
        while (nota < 0 || nota > 10) {                                                 //Condicion, vuelve a pedir la nota hasta que se cumpla

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }    //Si se pasa la condicion se imprime la siguiente linea
        System.out.println("Nota correcta");
    }
}
