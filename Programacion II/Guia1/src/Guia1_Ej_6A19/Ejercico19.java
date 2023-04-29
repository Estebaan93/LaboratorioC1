/*FUNCIONES EN JAVA
19. Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €.
 */
package Guia1_Ej_6A19;

import java.util.Scanner;


/**
 *
 * @author Esteban
 */
public class Ejercico19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        //Variables
        String euros, moneda;                                                                                     //Cadena
        double cantidad;                                                                                             //Real
        Scanner leer=new Scanner(System.in);                                                        //Scanner
        System.out.println("Escribe una cantidad de euros:");
        euros=leer.next();                                                                                             //Guardamos la cadena
        
        cantidad=Double.parseDouble(euros);                                                         //Se convierte euros que es una cadena A cantidad que es un entero (double)
        
        System.out.println("Escribe la moneda a la que quieres convertir");
        moneda=leer.next();                                                                                           //Guardamos la cadena
        moneda=moneda.toLowerCase();                                                                    //Usamos para convertir a minuscula toda la moneda para el switch
        
        //Llamamos la funcion
        divisas(cantidad, moneda);
    }
   public static boolean divisas (double cantidad, String moneda){
        double cambio=0;                           //Variable inicializada en 0
 
        //Boolean en caso de que la moneda no sea correcta
        boolean correcto = true;
 
        //Segun la moneda, calculamos la cantidad
        switch (moneda){
        case "libras":                                      //Libras
            cambio=cantidad*0.86;
            break;
        case "dolares":                                         //Dolares
            cambio=cantidad*1.28611;
            break;
        case "yenes":                                               //Yenes
            cambio=cantidad*129.852;
            break;
        default:                                //En caso de que se haya ingresado otra moneda o frase
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
 
        //Si es correcto
        if (correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +cambio);
            correcto=true;
        }
            return correcto;
    }
}
