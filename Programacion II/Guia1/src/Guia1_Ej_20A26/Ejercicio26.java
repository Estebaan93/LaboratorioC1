/*26. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P 
está contenida dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas
o columnas, existe al menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza el primer
elemento de la submatriz P. */
package Guia1_Ej_20A26;

import java.util.Scanner;                                                                                                                       //Clase Scanner
import java.util.Arrays;                                                                                                                         //Clase Arrays

/**
 *
 * @author Esteban
 */
public class Ejercicio26 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");                                             //Declaramos el Scanner de manera global

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int tam = 10;
        int tap = 3;

        int[][] matrizM = new int[tam][tam];                                                                                           //Dimensionamos la matriz M 10x10
        int[][] matrizP = new int[tap][tap];                                                                                                //Dimensionamos la matriz P 3x3
        
        System.out.println("Llenamos la matriz M de manera aleatoria:");
        LlenarMatrizM(matrizM, tam);                                                                                                      //Metodo llenar matriz M
        ImprimirMatriz(matrizM, tam);                                                                                                     //Metodo imprimir matriz
        System.out.println("");
        System.out.println("Llenamos la matriz P de manera manual:");
        LlenarMatrizP(matrizP, tap);                                                                                                           //Metodo llenar matriz P
        ImprimirMatriz(matrizP, tap);                                                                                                         //Metodo imprimir matriz
        System.out.println("");
        BuscarMatriz(matrizP, matrizM);                                                                                         //Metodo buscar matriz

    }

    public static void LlenarMatrizM(int[][] matriz, int lim) {                                                                     //Llenamos la matriz M
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                matriz[i][j] = (int) (Math.random() * 101);                                                                                       //Aleatorio hasta 100
            }

        }
    }

    public static void LlenarMatrizP(int[][] matriz, int lim) {                                                                   //Llenamos la matriz P
        int n;
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                System.out.println("Ingrese los valores para el indice:" + "[" + i + "]" + "[" + j + "]");                      //En que indice
                n = leer.nextInt();                                                                                                                                //Guardamos los valores
                matriz[i][j] = n;
            }

        }
    }

    public static void ImprimirMatriz(int[][] matriz, int lim) {                                                                //Imprimir matrices
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim; j++) {
                System.out.print("[" + matriz[i][j] + "]");                                                                                          //Sin salto de linea
            }
            System.out.println("");                                                                                                                          //Salto de linea
        }
    }

    public static void BuscarMatriz(int[][] matrizP, int[][] matrizM) {
        boolean encontrado = false;
        int f = 0, c = 0;                                                                                                                          //Variable fila, columna donde se va guardar la posicion que se encuentre [0,0]
        for (int i = 0; i < 8; i++) {                                                                                                          //Buscamos hasta 7, porque ya en 8 no se va encontrar por la dimension 3x3
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    /*Matriz 3x3 indice 0 si se encuentra se compara el resto de los lugares, tiene que ser secuencial la comparacion.
                    Podemos usar Arrays.deepEquals() para comparar cada elemento de las matrices, pero la logica seria copiar un fragmento desde
                    el primer elemento de la matriz P [0,0] de la matriz M, en adelante y pasarlo a una matriz auxiliar para copiar y comparar  ambas  matrices 3x3.
                     */
                    if (matrizM[i + 2][j + 2] > 0) {
                        f = i;
                        c = j;
                        encontrado = BuscarBuscar(matrizM, matrizP, f, c);
                    }
                }
            }
        }
        if (encontrado == true) {
            System.out.println("Se encontro la submatriz P en la fila "
                    + f + " y columna " + c);
        } else {
            System.out.println("La submatriz P no se encuentra en la matriz M");
        }
    }

    public static boolean BuscarBuscar(int matrizM[][], int matrizP[][], int f, int c) {
        boolean result = false;
        int a = 0, cont = 0;
        for (int k = f; k <= f + 2; k++) {
            int b = 0;
            for (int r = c; r <= c + 2; r++) {
                if (matrizM[k][r] == matrizP[a][b]) {
                    cont++;
                }
                b++;
            }
            a++;
        }
        if (cont == 9) {
            result = true;
        }
        //Si encontrado con el nro de referencia [0,0] se inicia la busqueda del resto de la matriz 3x3
        return result;

    }

}
