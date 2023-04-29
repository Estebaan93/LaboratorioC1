/*24. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas
(o viceversa).
MATRIZ				MATRIZ TRANSPUESTA
  0   -2    3				 0    -1    -4
  1    0    2				-2    0    -2
-4   -2    0				 3    2     0	

En este caso la matriz es anti simétrica.*/

package Guia1_Ej_20A26;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño de la Matriz: ");
        int n = leer.nextInt();                                                                                             //Leemos el tamaño de la matriz
        
        int [][] Matriz = new int [n][n];                                                                             //Dimensionamos
        
        LlenaMatriz(Matriz, n);                                                                                         //Metodo llenar
        
        System.out.println("MATRIZ ORIGINAL");
        ImprimeMatriz(Matriz, n);                                                                                   //Metodo imprimir
        
        ConvierteATranspuesta(Matriz, n);                                                                   //Metodo convertir a transpuesta
        System.out.println("MATRIZ TRANSPUESTA");
        ImprimeMatriz(Matriz, n);                                                                                 //Metodo imprimir matriz
        ConvierteAAntisimetrica(Matriz, n); //*-1                                                      //Metodo convierte antisimetrica
        System.out.println("MATRIZ ANTISIMETRICA");
        ImprimeMatriz(Matriz, n);                                                                                   //Imprimimos
        
        //Compruebo si la matriz es anti simetrica
        compruebo (Matriz,n);
        
    }
    public static void LlenaMatriz(int[][] matriz, int lim){
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                matriz [i][j] = (int)(Math. random()*51);                                            //Aleatorio del 0 al 50
            }
        }
    }
    
    public static void ConvierteATranspuesta(int [][] matriz, int lim){
       int [][] MT =new int [lim][lim];                                             //Utilizamos una matriz auxiliar
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                MT[j][i] = matriz [i][j]; 
                ///456       ///461
                ///654       ///552
                ///123       ///643
            }
        }
        
        for (int i = 0; i < lim; i++) {
             for (int j = 0; j < lim; j++) {
                matriz [i][j] = MT [i][j];                                                  //Se guarda la matriz transpuesta
            }
        }
    }
public static void ImprimeMatriz(int [][] matriz, int lim){
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                System.out.print("["+matriz[i][j]+"]");   
            }
            System.out.println("");
        }
    }
    public static void ConvierteAAntisimetrica(int [][] matriz, int lim){
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                matriz [i][j] = matriz[i][j] * -1;
            }
        }
}
    public static void compruebo(int matriz [][], int lim){
        int i, j;
        boolean resul = false;
        
          for (i = 0; i < lim; i++) {   
            for (j = 0; j < lim; j++) {
                if (matriz[i][j] + matriz [j][i] !=0) {
                    resul=true;
                }
            }
          }
          if (resul) {
              System.out.println("La matriz es antisimetrica");
        } else {
              System.out.println("La matriz no es antisimetrica");
          }
          
    } 
}
