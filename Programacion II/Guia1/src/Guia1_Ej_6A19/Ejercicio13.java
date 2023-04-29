/*13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos
supere el límite inicial. 
*/
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea la variable Scanner leer
        Scanner leer=new Scanner(System.in);
        int num, i, max;                                                                    //Variable de tipo entero
        i=0;                                                                                     //Inicializamos la variable en 0, esta me va sumar los valores
        
        System.out.print("Escriba un valor limite: ");
        max=leer.nextInt();                                                                 //Guardamos el valor maximo
        
        System.out.println("Ingrese numeros");
        
        while (i<=max) {                                                                    //Mientras la suma no supere al maximo se ejecutar
            num=leer.nextInt();                                                            //Lectura en la entrada de valores
            i=+i+num;                                                                           //Variable centinela que me suma los numeros
        }
        System.out.println("Se supero el limite de "+max+ " con la suma de "+i);                                            //Concatenamos
    }   
 
}
