/*4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado  puede causar una excepción de tipo InputMismatchException, el método 
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un número por cero surge una 
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques try/catch para las distintas excepciones */
package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio4 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Excepcion e = new Excepcion();
        System.out.println("Ingrese dos numeros, estos se guardaran en string..");
        e.setNum(leer.next());
        e.setNum2(leer.next());
        System.out.println("Realizamos la conversion a int..");
        e.operar();

        System.out.println("");
        System.out.println("Ingrese dos numeros para verificar si son de tipo entero");
        try {
            e.setN3(leer.nextInt());
            e.setN4(leer.nextInt());
        }
         catch(InputMismatchException i){         
            System.out.println("No se puede convertir el caracter especial a entero "+ i.getMessage());
        }
        System.out.println("Los numeros ingresados son " + e.getN3() + " y " + e.getN4());

    
    }
}
