/*5. Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al
descuento) y determine el importe en efectivo a pagar por dicho socio..
 */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio5E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");                                                               //Scanner de manera global
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String socio;                                                                                                                                   //Tipo caracter
        
        System.out.println("Ingrese el tipo de socio, siendo A, B o C");
        socio=leer.nextLine();
        
        while (socio.equals("A") || (socio.equals("B")) || (socio.equals("C"))) {
            System.out.println("No existe el socio ingresado, por favor ingrese nuevamente");
            socio=leer.nextLine();
        }
        
    }
    
}
