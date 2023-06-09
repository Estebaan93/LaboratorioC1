/*3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas. En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda en una
lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no. Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.*/
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Alumno {
    //Atributos
    private String nombre;
    private ArrayList<Integer> notas;

    //Constructor
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
//Inicializamos el array
    public Alumno() {
        this.notas=new ArrayList<>();
    } 

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas.add(notas);
    }    
    
    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
    Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.*/
    public double notaFinal(){
        double suma=0;
        for (Integer i : notas) {
            suma+=i;
        }
        return suma/notas.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas +", promedio="+notaFinal()+ '}';
    }
    
}
