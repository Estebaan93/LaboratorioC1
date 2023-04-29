/*1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de perro en un bucle, el mismo se guardará en la 
lista y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList. */
package Ejercicio1;

import java.util.ArrayList; //Importamos el ArrayList
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Razas {
//Atributos
    private ArrayList<String> razas;        //Lo vamos inicializar desde el constructor
    private String buscar;                      //Ejercicio 2
    int Encontrado = 0;                         //Ejercicio 2

    //Constructor
    public Razas() {
        this.razas = new ArrayList();        //Inicializamos el ArrayList
    }
    

    //Get & Set
    public ArrayList<String> getRazas() {
        return razas;
    }
    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }

    //Metodo guardar raza tiene como parametro raza, viene del lado del main
    public void guardarRaza(String raza) {
        //Agregamos las razas en el ArrayList de tipo String
        razas.add(raza);
    }

    //Metodo mostrar raza con forEach
    public void mostrarRazas() {
        //Utilizamos el forEach for (Tipo de dato variableVacia : Colección)
        for (String aux : razas) {
            System.out.println(aux);
        }
    }

    /**
     * EJERCICIO 2 
     **/
    
    public void itera() {
        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(buscar)) {
                it.remove();
                Encontrado = 1;
            } else {
                Encontrado = 0;
            }
        }
    }

    //Ejercicio2 imprimimos con iterator
    public void imprimirIterator() {
        System.out.println("Imprimimos con Iterator");
        Iterator<String> it = razas.iterator();
        if (Encontrado == 0) {
            System.out.println("La raza no se encontro en la lista");
        }
        while (it.hasNext()) {
            String aux = it.next();
            System.out.println(aux);
        }
    }

    //Ejercicio2
    public void ordenar() {
        System.out.println("Ordenamos");
        Collections.sort(razas);
        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            System.out.println(aux);
        }
    }

}
