/*Ingrese un numero por teclado y determine si es par o impar */
package egg.IntroJava;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class FuncionBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer
        Scanner leer=new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        if (par(num))
            System.out.println("Es par");
        else 
            System.out.println("Es impar");
    }
    
    public static boolean par(int num) {
        
        if (num/2==0) {
            return true;
        } else {
            return false;
        }
    }
    
}
