/*7. Crear un programa que dado un numero determine si es par o impar.
 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);                            //Creamos el Scanner leer
        int num;                                                                                //Creamos la variable que guardara el valor
        
        System.out.println("Ingrese un numero para verificar si es par o impar");
        num=leer.nextInt();
        
        //Condicional para verificar si es par o impar
        if (num%2==0) {             //Si es residuo 0 
            System.out.println("El numero "+num+" es par");
    }  else {                               //Si no es residuo 0
            System.out.println("El numero "+num+" es impar");
        }
}
}
