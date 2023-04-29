/*9. Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el 
cociente. Por ejemplo: 50 / 13: 
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio9E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int n1, n2, r, c = 0;
        System.out.println("Ingrese 2 numeros");
        n1=leer.nextInt();
        n2=leer.nextInt();
        r=n1;
        do {
           r=r-n2;
           c++;
        } while (r>n2);
        System.out.println("Residuo: "+r);
        System.out.println("Cociente: "+c );
        
        
        
                 
    }
    
}
