/*17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente
* * * * 
*       *
*       *
* * * *
 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercico17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int a, b, n;                                                                                            //Variable de tipo entero
        /*for (<inicialización>; <terminación>; <incremento>) {
            <sentencias>}*/
        System.out.println("Escribe un numero");
        n=leer.nextInt();                                                                               //Leemos los datos ingresados por ususarios
        if (n>0){                                                                                             //        Condicional si mayor a 0
            
            for (a=1; a<=n; a++){                                                               
            for (b=1; b<=n; b++){
                  if (a>1 && a<n && b>1 && b<n){                                //Si a mayor a 1, y a menor que n, b mayor a 1 y b menor que n
                      System.out.print("  ");                                               //Imprime un espacio
                  }else {                                                                           //Si no un asterisco
                      System.out.print("* ");
                  }
               } System.out.println(" ");                                               //Salto de linea
             }
        }
    }
}
