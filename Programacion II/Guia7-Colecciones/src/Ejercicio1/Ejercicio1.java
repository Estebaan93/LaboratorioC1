/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de perro en un bucle, el mismo se guardará en la 
lista y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList */
package Ejercicio1;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio1 {
public static Scanner leer = new Scanner(System.in).useDelimiter("\n");     //Scanner

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String raza, respuesta = "";
        // Creamos la clase
        Razas r1 = new Razas();
        do {
            System.out.println("Ingrese una raza de perro");
            raza = leer.next();
            //Guardamos en el metodo que contiene el ArrayList
            r1.guardarRaza(raza);
            System.out.println("Desea guardar otra raza de perro?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("Si"));
        System.out.println("");
        System.out.println("Las razas de perros guardadas son: forEach");
        //Mostramos las razas con un forEach
        r1.mostrarRazas();

    }

}
