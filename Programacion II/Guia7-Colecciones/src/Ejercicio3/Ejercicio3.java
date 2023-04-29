/*3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas. En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda en una
lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no. Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.*/
package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio3 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resp = "";
        boolean encontrado=false;
        //ArrayList del objeto Alumno
        ArrayList<Alumno> listaAlumnos = new ArrayList();
      //  listaAlumnos = new ArrayList();
        do {
            Alumno a1 = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            a1.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("nota " + (i + 1) + ":");
                a1.setNotas(leer.nextInt());
                //int n = leer.nextInt();
               // a1.agregar(n);
            }
            listaAlumnos.add(a1);
            System.out.println("Desea agregar otro alumno?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("Si"));
        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
        /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
    Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método y mostrado en el main.*/
        do {
            
            System.out.println("Buscar alumno para la nota final:");
            String alumnoBuscar = leer.next();
            ListIterator i = listaAlumnos.listIterator();
            while (i.hasNext()) {
                Alumno aux = (Alumno) i.next();
                if (aux.getNombre().equalsIgnoreCase(alumnoBuscar)) {
                    System.out.println("Nota final:"+aux.notaFinal());
                    encontrado=true;
                }
            
                if (!encontrado) {
                  System.out.println("No se encontro el alumno");
                } 
            }
            System.out.println("Buscar otro alumno?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("Si"));
      
    }

}
