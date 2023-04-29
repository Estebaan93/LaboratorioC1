/*25. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
*/
package Guia1_Ej_20A26;

import java.util.Scanner;
import java.util.*;                                                                                                                 //Caja negra 
/**
 *
 * @author Esteban
 */
public class Ejercicio25 {
    
    /**
     * @param args the command line arguments
     */
    
   public static Scanner leer = new Scanner(System.in).useDelimiter("\n");             //Declaramos el Scanner leer de manera global
   
    public static void main(String[] args) {
    
    int tam=3;                                                                                                                            //Variable de tipo entero    
                                                                                                                                    
    int[][] matriz = new int [tam][tam];                                                                    //Dimensionamos la matriz cuadrada 3x3
        
        System.out.println("Llenamos la matriz");
        LlenarMatriz(matriz,tam);                                                                               //Metodo llenar matriz
        System.out.println("Imprimimos la matriz");
        ImprimeMatriz(matriz, tam);                                                                         //Metodo imprimir matriz
        System.out.println("");
        VerificarMagica(matriz, tam);                                                                          //Metodo verificar matriz
        }
  
 public static void LlenarMatriz(int [][] matriz, int tam ) {
       int i,j,num;
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                System.out.println("Ingrese numero entre 1-9");
                num=leer.nextInt();
                while (num<1 || num>9) {
                    System.out.println("Numero fuera de rango, ingrese nuevamente");
                    num=leer.nextInt();  
                }
                matriz[i][j]=num;
            }
        } 
   }
 
 public static void ImprimeMatriz(int [][] matriz, int tam) {
      //Imprimimos la matriz
     int sumaColum[]=new int [matriz.length];
     int sumaFilas=0;
     int i,j;
     for ( i = 0; i < tam; i++) {
           for ( j = 0; j<tam; j++) {
               System.out.print("["+matriz[i][j]+"]");   
               sumaFilas+= matriz[i][j];
               sumaColum[i]+=matriz[i][j];
          }
           System.out.print("="+sumaFilas);
            System.out.println("");
            sumaFilas=0; 
        } 
     System.out.println(Arrays.toString(sumaColum));                                          
}
 
 public static boolean VerificarMagica(int [][] matriz, int tam) {
    int suma_linea= matriz[0][0] + matriz[0][1]+matriz[0][2];
    boolean magica=true;
     for (int i = 0; i < tam; i++) {
         //Verifico columnas
         if (matriz[i][0]+matriz[i][1]+matriz[i][2]!=suma_linea) {
             magica=false;
             break;
         }
         //Verifico lineal
         if (matriz[0][i]+matriz[1][i]+matriz[2][i]!=suma_linea) {
             magica=false;
             break;
         }
     }
     //Suma diagonal principal
     if(matriz[0][0]+matriz[1][1]+matriz[2][2]!=suma_linea) {
         magica=false;
     }
    //Suma diagonal secundaria
    if(matriz[2][0]+matriz[1][1]+matriz[0][2]!=suma_linea) {
        magica=false;
    }
       if(magica) {
           System.out.println("La matriz es magica");
       }else {
           System.out.println("La matriz no es magica");
       }
       return magica;
    }  
 
}

