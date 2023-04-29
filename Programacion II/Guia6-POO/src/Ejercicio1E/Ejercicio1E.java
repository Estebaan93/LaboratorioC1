/*1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá definir además dos constructores: uno vacío que inicializa el titulo y el autor a 
cadenas vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes. */
package Ejercicio1E;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio1E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto
        Cancion c1=new Cancion();
        System.out.println("Ingrese el autor");
        c1.setAutor(leer.next());
        System.out.println("Ingrese el titulo de la cancion");
        c1.setTitulo(leer.next());
        System.out.println("El autor es: "+c1.getAutor());
        System.out.println("El titulo es: "+c1.getTitulo());
        
        
    }
    
}
