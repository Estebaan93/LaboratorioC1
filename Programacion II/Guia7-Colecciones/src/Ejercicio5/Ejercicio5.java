/*5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el 
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario. */
package Ejercicio5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Ejercicio5 {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String buscar, salir="";
        boolean encontrado=false;
       HashSet <Paises> pais=new HashSet();        
      
        do {
            Paises p1=new Paises();                                                //Instanciamos adentro del bucle, sino me reemplaza el valor
            System.out.println("Ingrese un pais:");
            p1.setNombre(leer.next().toUpperCase());               //Convertimos en mayuscula, para no generar problemas                                       
            //Guardamos en el HashSet
             pais.add(p1);  
            System.out.println("Desea guardar otro pais? Si/No");
            salir=leer.next();
        } while (salir.equalsIgnoreCase("Si"));
        System.out.println("");
        System.out.println("Mostramos los paises guardados:");
        for (Paises aux : pais) {
            System.out.println(aux.getNombre());
        }
        System.out.println("");
        System.out.println("Ordenamos el conjunto alfabeticamente");
        ArrayList<Paises> ordenarPaises=new ArrayList(pais);
        Collections.sort(ordenarPaises);
        for (Paises aux : ordenarPaises) {  
            System.out.println(aux.getNombre());
        }
        System.out.println("");
        do {
            System.out.println("Ingrese un pais para eliminar:");
            buscar=leer.next().toUpperCase();
             Iterator<Paises> it= pais.iterator();
            while(it.hasNext()){
                if (it.next().getNombre().equalsIgnoreCase(buscar)) {
                    it.remove();
                    System.out.println("Se elimino el pais: "+ buscar);
                    encontrado=true;
                   // break;
                }
            }if (!encontrado) {
                    System.out.println("No se encontro el pais: " + buscar);
                }
            System.out.println("Desea eliminar otro pais? Si/No");
            salir=leer.next();
        } while (salir.equalsIgnoreCase("Si"));
        System.out.println("");
        ArrayList<Paises> ordenarPaises2=new ArrayList(pais);
        Collections.sort(ordenarPaises2);
        System.out.println("Mostramos la lista:");
         Iterator<Paises> it= pais.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getNombre());
        }
        System.out.println("");
        for (Paises aux : ordenarPaises2) {
            System.out.println(aux);
        }
       
        
    }
    
}
