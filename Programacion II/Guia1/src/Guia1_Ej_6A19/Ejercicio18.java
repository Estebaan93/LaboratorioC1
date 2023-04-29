/*18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int num1, num2, num3, num4, i;
        
        System.out.println("Ingrese cuatro numeros del 1 al 20:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        num3=leer.nextInt();
        num4=leer.nextInt();
        
        //Condicion
        while(num1<1 || num1>20 || num2<1 || num2>20 || num3<1 || num3>20 || num4<1 || num4>20){
        System.out.println("Algun numero/s esta/n afuera del rango 1-20, ingrese nuevamente:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        num3=leer.nextInt();
        num4=leer.nextInt();
        }
        //Numero 1
        System.out.println("");
        System.out.print(num1+" ");
        for (i=1; i<=num1; i++){
            System.out.print("*");
          }
        //Numero 2
 System.out.println("");
        System.out.print(num2+" ");
        for (i=1; i<=num2; i++){
            System.out.print("*");
          }
        //Numero 3
        System.out.println("");
        System.out.print(num3+" ");
        for (i=1; i<=num3; i++){
            System.out.print("*");
          }
        //Numero 4
        System.out.println("");
        System.out.print(num4+" ");
        for (i=1; i<=num4; i++){
            System.out.print("*");
          }
        System.out.println("");
    }
    
}
