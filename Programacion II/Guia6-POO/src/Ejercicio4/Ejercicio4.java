/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el 
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el 
perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio4 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");                                                       //Scanner

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del objeto   
        Rectangulo r1 = new Rectangulo();

        //Le pedimos la base y altura del rectangulo al usuario
        System.out.println("Ingrese la base y la altura del rectangulo");
        int base = leer.nextInt();
        int altura = leer.nextInt();

        //Solo rectangulo
        while (base == altura) {
            System.out.println("Es un cuadrado, no un rectangulo. Ingrese nuevamente");
            base = leer.nextInt();
            altura = leer.nextInt();
        }

        //Le pasamos por parametros
        r1.crearRectangulo(base, altura);
        //Llamamos a imprimir
        r1.imprimir();

    }

}
