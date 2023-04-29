/*22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia1_Ej_20A26;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner leer
        Scanner leer=new Scanner(System.in);
        int tama;                                                                                                 //Variable de tipo entero
        int c1=0, c2=0, c3=0, c4=0, c5=0;                                                     //Contadores de digitos centinela
        
        System.out.println("Ingrese el tamaño del vector");
        tama=leer.nextInt();
         int [] vector =new int [tama];                                                        //Dimensionamos el vector
         
         //Bucle for para llenado utilizando la funcion length
        for (int i=0; i < vector.length; i++) {
        vector[i]=  (int) (Math.random() * 100000);                             //Aleatorio hasta 99999
    }
                                                                                                                   
        //Bucle for para imprimir el vector
        for (int i=0; i<tama;i++){
            
            //Descomentar para que funcione la impresion por pantalla, dentro de cada indice me dice la cantidad de digitos
          System.out.println("["+vector[i]+"]"+ " tiene "+digitos(vector[i])+" digitos") ;
          
          switch (digitos(vector[i])) {
              
              case 1:
                  c1++;                                                                 //Me va guardar la cantidad de digitos de 1
                  break;
                  
              case 2:
                  c2++;                                                             //Me va guardar la cantidad de digitos de 2
                  break;
                       
              case 3:
                  c3++;                                                         //Me va guardar la cantidad de digitos de 3
                  break;
                  
              case 4:
                  c4++;                                                             //Me va guardar la cantidad de digitos de 4
                  break;
                  
              case 5:
                  c5++;                                                             //Me va guardar la cantidad de digitos de 5
                   break;                
          }         
        }
        //Imprimimos afuera del for
        System.out.println("Numero de 1 digito: "+ c1);
        System.out.println("Numero de 2 digitos: "+ c2);
        System.out.println("Numero de 3 digitos: "+ c3);
        System.out.println("Numero de 4 digitos: "+ c4);
        System.out.println("Numero de 5 digitos: "+ c5);
        System.out.println("");
        
    }
     public static int digitos(int num) {
        /*Metodo estatico
         nos regresa la cantidad de digitos por indice del vector
         */
         
        return num = String.valueOf(num).length();               //Me retorna la cantidad de digitos que tiene un indice
     }
    
}
