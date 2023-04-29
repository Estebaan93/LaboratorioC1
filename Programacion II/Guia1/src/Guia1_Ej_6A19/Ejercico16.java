/*16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercico16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
         Scanner leer=new Scanner(System.in);
         String cadena="";                                                                                                  //Inicializamos en caracter vacio
         int total=0, correctas=0, incorrectas=0, largo=0;                                          //Inicializamos las variables en 0
         System.out.println("***************************************");
         System.out.println("*DISPOSITVO RS232 LECTURA DE CADENAS  *");
         System.out.println("*ESCRIBA &&&&& PARA FINALIZAR         *");
         System.out.println("***************************************");
         
         while (!(cadena.equals("&&&&&"))){     //Condicion mientras sea diferente de
                                                                                 //equals. Sirve para comparar si dos cadenas son iguales. Devuelve T o F
             total++;                                                       //Contador 1+1 acumula el total de cadenas ingresadas
             cadena=leer.next();
             largo=cadena.length();                                 //length retorna la longitud de la cadena
             if(largo<6){                                                       //Condicion maximo 5 caracteres
                 //Si X && O son iguales a la cadena que se ingresa se suma a correctas un valor. (0,1) equivale a la "X "y (largo-1, largo) a la ultima letra de la cadena "O"
                 if(("X".equals(cadena.substring(0,1))) && ("O".equals(cadena.substring(largo-1, largo)))){     //substring. Retorna la sub cadena 
                 correctas++;                                                                                                                                                   //desde el carácter del parámetro  
             }else {
                     incorrectas++;                                                                                                                                          //Me acumula las incorrectas
                     }
             }
         }
         //Se le agrega -1, en caso de que no se ingrese ninguna cadena y no me cuente el total del "&&&&&" como un intento.
         System.out.println("Correctas: "+ correctas+ " , Incorrectas: "+ incorrectas + " de un total de: "+ (total-1)); 
         
    }
    
}
