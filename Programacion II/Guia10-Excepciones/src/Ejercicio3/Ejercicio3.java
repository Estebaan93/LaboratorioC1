/*3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para  leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la 
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo  int. Por ultimo realizar una división con los dos numeros y mostrar el resultado. */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio3 {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  leer dos números en forma de cadena
        DivisionNumero d=new DivisionNumero();
        
        System.out.println("Ingrese dos numeros");
        d.setN1(leer.next());
        d.setN2(leer.next());
        
        d.operar();
        
    }
    
}
