/*15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.  */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio15E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int s, r, m, d, n1, n2, opc, resul;
        System.out.println("Ingrese 2 numeros.");
        n1=leer.nextInt();
        n2=leer.nextInt();
        System.out.println("");
        System.out.println("MENU");
        System.out.println("Elija una opcion");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        opc=leer.nextInt();
        System.out.println("");
        switch (opc) {
            case 1:
                resul=n1+n2;
                System.out.println("RESULTADO");
                System.out.println(resul);
                break;
            case 2:
                resul=n1-n2;
                System.out.println("RESULTADO");
                System.out.println(resul);
                break;
            case 3:
                resul=n1*n2;
                System.out.println("RESULTADO");
                System.out.println(resul);
                break;
            case 4:
                resul=n1/n2;
                System.out.println("RESULTADO");
                System.out.println(resul);
                break;
            default:
                System.out.println("OPCION INCORRECTA");
        }
        System.out.println("");
        
    }
    
}
