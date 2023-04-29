/*Condicionales en Java 
6. Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla.

 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);        //Creamos el Scanner leer
        int num, num2;                                                  //Creamos las variables
        
        System.out.println("Ingrese dos numeros");
        num=leer.nextInt();                 //Guardamos el valor del numero 1
        num2=leer.nextInt();            //Guardamos el valor del numero 2
        
        if (num>num2){                          //Condicion logica
            System.out.println("El mayor numero es "+num);              //Si num es mayor se cumple
        } else {                                                                                              //SiNo
            System.out.println("El mayor numero es "+num2);             //Su num2 es mayor se cumple 
        }
    }
    
}
