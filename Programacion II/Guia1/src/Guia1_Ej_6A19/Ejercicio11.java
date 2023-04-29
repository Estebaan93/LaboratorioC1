/*11. Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de
una bomba para mover fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”. 
Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”. 
Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba"
*/
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int tipoMotor;                                                      //Me guardara la opcion del usuario
        
        System.out.println("Ingrese el tipo de motor del 1 al 4:");
        tipoMotor=leer.nextInt();
        
        //Condicional
            switch (tipoMotor) {
                
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe un valor válido para tipo de bomba");
        }
            
        }
        
    }
   
