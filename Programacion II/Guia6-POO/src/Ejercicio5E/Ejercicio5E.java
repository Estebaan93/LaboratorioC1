/*5. Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo introduciendo otro mes: agosto ¡Ha acertado!*/
package Ejercicio5E;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio5E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int count = 0;
        String mes_ingresado;
        Random numRandon=new Random();
        //Hasta 12 meses
        int index1=numRandon.nextInt(12);               //Otra forma de generar numeros aleatorios, importar la clase Random
        int index = (int) (Math.random() * 12);
        //Vector
        final String mes[];
        mes = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println(index1+1);                   //Le sumamos 1 porque el array comienza en 0.
        System.out.print("Adivine el mes secreto: (ingrese un mes hasta adivinar el secreto)");
        do {
            count++;
            System.out.print("Ingrese Mes>> ");
            mes_ingresado = leer.next();
            if (mes_ingresado.equalsIgnoreCase(mes[index1])) {
                System.out.println("Mes correcto " + count + " ingresos para descubrirlo");
                break;
            } else {
                System.out.println("Mes incorrecto , intente nuevamente");
            }
        } while (true);

    }

}
