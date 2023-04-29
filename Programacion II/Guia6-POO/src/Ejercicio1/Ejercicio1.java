/*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio1 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del objeto
        Libro mensajero = new Libro();

        System.out.println("******************************");
        System.out.println("*INGRESE LOS DATOS DEL LIBRO *");
        System.out.println("******************************");
        System.out.println("Ingrese el ISBN:");
        int isbn = leer.nextInt();
        System.out.println("Ingrese el titulo:");
        String titulo = leer.next();
        System.out.println("Ingrese el autor:");
        String autor = leer.next();
        System.out.println("Ingrese el numero de paginas:");
        int numeroPag = leer.nextInt();
        
        //Metodo cargar libro
        mensajero.lector(isbn,titulo, autor, numeroPag);
        System.out.println("");
        //Metodo impriimir
        mensajero.imprimir();
    }

}
