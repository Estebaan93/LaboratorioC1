/*12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
Y los siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
     crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que 
    la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.  Tener en cuenta que para conocer la edad de la persona también se debe conocer 
    la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método anterior. */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio12 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto
        Persona p1 = new Persona();
        
        System.out.println("Ingrese un nombre");
        String nombre = leer.next();
        System.out.println("Ingrese una fecha de nacimiento");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();
        /* crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, 
         recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.  */
        p1.crearPersona(nombre, anio, mes, dia);
         /* método calcularEdad() a partir de la fecha de nacimiento ingresada.  Tener en cuenta que para conocer la edad de la persona también se debe conocer 
        la fecha actual.*/
        p1.calcularEdad();
        /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga menor edad que la
           persona que se recibe como parámetro, o false en caso contrario.*/
        System.out.println("Ingrese una edad, verificaremos si es menor o mayor");
        int menor = leer.nextInt();
        p1.menorQue(menor);
        System.out.println(p1.menorQue(menor));
        
        /*Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.*/
        p1.mostrarPersona();
        System.out.println(p1.toString());
    }

}
