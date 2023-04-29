/*2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.  */
package Ejercicio2;

import static Ejercicio1.Ejercicio1.leer;       //Importamos el scanner de la clase Ejercicio1
import Ejercicio1.Razas;                                //Importamos la clase Razas

/**
 *
 * @author Esteban
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String raza, respuesta = "";
        //Creamos el objeto razas 2
        Razas r2 = new Razas();
        do {
            System.out.println("Ingrese una raza de perro");
            raza = leer.next();
            //Guardamos en el metodo que contiene el ArrayList desde Razas Ejercicio1
            r2.guardarRaza(raza);
            System.out.println("Desea guardar otra raza de perro?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("Si"));
        System.out.println("Ingrese una raza para eliminar");
        r2.setBuscar(leer.next());
        r2.itera();
        r2.imprimirIterator();
        r2.ordenar();

    }

}
