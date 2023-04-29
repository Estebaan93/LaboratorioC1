/*4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase Pelicula con el titulo, director y duración de la 
película (en horas). Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;      
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio4 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList del tipo peliculas coleccion de objeto
        ArrayList<Peliculas> listaPeliculas = new ArrayList<>();
        // listaPeliculas = new ArrayList();
        String r = "";
        //Bucle para crear el objeto pelicula
        do {
            Peliculas p1 = new Peliculas();
            System.out.println("Ingrese el titulo de la pelicula:");
            p1.setTitulo(leer.next());                                                                                         //Seteamos el titulo
            System.out.println("Ingrese el director de la pelicula:");
            p1.setDirector(leer.next());                                                                                    //Seteamos el director
            System.out.println("Ingrese la duracion de la pelicula (minutos):");
            p1.setDuracion(leer.nextInt());                                                                             //Seteamos la duracion
            //Agregamos el objeto a la coleccion del arraylist (lista peliculas)
            listaPeliculas.add(p1);
            System.out.println("Desea agregar otra pelicula?");
            r = leer.next();
        } while (r.equalsIgnoreCase("Si"));
        System.out.println("");
        System.out.println("Imprimimos con iterator todos los objetos y sus atributos segun se fueron cargando:");
        //Iterator para imprimir la coleccion del objeto mostrandolo con toString()
        Iterator<Peliculas> it = listaPeliculas.iterator();
        while (it.hasNext()) {
            Peliculas aux = it.next();
            System.out.println(aux);
        }
        System.out.println("");
        System.out.println("Peliculas mayores a 1 hora de duracion:");
        //•Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        for (Peliculas aux : listaPeliculas) {
            if (aux.getDuracion() > 60) {
                System.out.println(aux.getTitulo()+", Duracion: "+aux.getDuracion());                             //Concatenamos
            }
        }
        System.out.println("");
        //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
        System.out.println("Ordenamos de mayor a menor duracion:");
        Collections.sort(listaPeliculas, new Comparator<Peliculas>(){                                                                                                       
            @Override
            public int compare(Peliculas p, Peliculas p1){
                return p1.getDuracion()-p.getDuracion();                                                                            //De mayor a menor
            };
        });
        for (Peliculas aux : listaPeliculas) {
            System.out.println(aux.getTitulo()+", Duracion: "+aux.getDuracion());
        }
        System.out.println("");
       // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        System.out.println("Ordenamos de menor a mayor duracion:");
        Collections.reverse(listaPeliculas);                                                                                               //Damos vuelta la lista peliculas
        for (Peliculas aux : listaPeliculas) {
            System.out.println(aux.getTitulo()+", Duracion: "+aux.getDuracion());
        }
        System.out.println("");
        //• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        System.out.println("Ordenamos alfabeticamente por titulo:");
        Collections.sort(listaPeliculas, new Comparator <Peliculas>() {
            @Override
            public int compare(Peliculas p, Peliculas p1) {
                return p.getTitulo().compareToIgnoreCase(p1.getTitulo());      
            };
        });
        for (Peliculas aux : listaPeliculas) {
            System.out.println(aux.getTitulo());
        }
        System.out.println("");
        //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        System.out.println("Ordenamos alfabeticamente por director:");
       Collections.sort(listaPeliculas, new Comparator <Peliculas>() {
            @Override
            public int compare(Peliculas p, Peliculas p1) {
                return p.getDirector().compareToIgnoreCase(p1.getDirector());   
            };
        });
        for (Peliculas aux : listaPeliculas) {
            System.out.println(aux.getDirector()+" , Titulo: "+aux.getTitulo());
        }
         
    }
}
