/*15. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercico15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int num = 0, i, suma, j;                                                                                        //Variable de tipo entero
        j=0;
        suma=0;                                                                                                       //Inicializamos en 0, aqui se va almacenar la suma de los numero positivos
                                                                                                                   
         System.out.println("Ingrese 20 numero al azar");                                                       
     
      for (i=0; i<20; i++) {                                                                                   //Centinela inicializada en 0
        num=leer.nextInt();                                                                         //Leemos el dato ingresado
        if (num>0){
        suma=suma+num;                                                                          //Almacenamos los nros positivos
        }
        j++;
        if (num==0) {
           break; 
        }
      }
      if (num==0) {
          System.out.println("Se capturo el numero 0");
          System.out.println("La suma es "+ suma);
      } else {
          System.out.println("La suma es "+suma);
      }
    }
    
}
