/*5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt()
 */
package Guia1_Ej_1A5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);        //Creamos la variable Scanner de leer
        int num, numDoble,numTriple;                     //Creamos las variables de tipo entero
        double numRaiz;                                              //Creamos la variable de tipo real
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();                         //Guardamos el valor de numero ingresado
        
        numDoble=num*2;                                                       //Obtenemos el doble
        numTriple=num*3;                                                       //Obtenemos el triple
        numRaiz= Math.sqrt(num);                                      //Obtenemos la raiz cuadrada con decimal
          
                
        System.out.println("El doble del numero "+num+ " es " +numDoble);
        System.out.println("La triple del numero "+num+ " es "+numTriple);
        System.out.println("La raiz cuadrada del numero "+num+ " es "+numRaiz );
        
    }
    
}
