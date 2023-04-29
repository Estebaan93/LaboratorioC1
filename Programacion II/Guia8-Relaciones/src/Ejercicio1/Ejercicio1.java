/*1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y 
tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y Perro. Ahora deberemos en el main crear dos Personas y dos Perros. 
Después, vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase Persona, la información del 
Perro y de la Persona.*/
package Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio1 {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona>personas=new ArrayList();             //Cramos un ArrayList para dos personas :)
            for (int i = 0; i < 2; i++) {
            Perro p2=new Perro();
            Persona per1=new Persona();
            System.out.println("Ingrese el nombre del perro "+(i+1)+":");
            p2.setNombre(leer.next());
            System.out.println("Ingrese la raza:");
            p2.setRaza(leer.next());
            System.out.println("Ingrese la edad:");
            p2.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño:");
            p2.setTamanio(leer.next());
            System.out.println("");
            System.out.println("Ingrese el nombre de la persona "+(i+1)+":");
            per1.setNombre(leer.next());
            System.out.println("Ingrese el apellido:");
            per1.setApellido(leer.next());
            System.out.println("Ingrese la edad:");
            per1.setEdad(leer.nextInt());
            System.out.println("Ingrese el documento:");
            per1.setDocumento(leer.nextInt());
            per1.setPerro(p2);                                          //Le asignamos el objeto perro al objeto persona
            personas.add(per1);                                               //Agregamos al ArrayList
            System.out.println("");
            }
        
        System.out.println("Imprimimos las personas con sus mascotas:");
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
        
    }
    
}
