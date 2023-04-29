/*2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio2 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion del objeto
        Circunferencia mensajero = new Circunferencia();

        System.out.println("Ingrese el radio");
        double radio = leer.nextDouble();
        mensajero.crearCircunferencia(radio);

        mensajero.imprimir();
        System.out.println("");
    }

}
