/*2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. 
Utilizar sólo una variable auxiliar */
package Guia1Extras;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio2E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");                                                                   //Scanner de manera global
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int a,b,c,d,aux;
        System.out.println("Ingrese un valor para A");
        a=leer.nextInt();
        System.out.println("Ingrese un valor para B");
        b=leer.nextInt();
        System.out.println("Ingrese un valor para C");
        c=leer.nextInt();
        System.out.println("Ingrese un valor para D");
        d=leer.nextInt();
        System.out.println("");
        /*
        B=C
        C=A
        A=D
        D=B
        */
        System.out.println("Valores cambiados");
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("A es igual a "+a);
        System.out.println("B es igual a "+b);
        System.out.println("C es igual a "+c);
        System.out.println("D es igual a "+aux); 
        
    }
    
}
