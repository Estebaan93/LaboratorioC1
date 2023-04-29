/*Llenado de matriz cuadrada manual.
 */
package egg.IntroJava;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class LlenadoDeMatrizCuadradaManual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int tam, num;                                                                                                        //Variable de tipo entero que me va dimensior la matriz
        
        System.out.println("Ingrese un tamaño para la matriz cuadrada");
        tam=leer.nextInt();
        
        int matriz [][]=new int [tam][tam];                                                                 //Dimensionamos la matriz cuadrada
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese un numero para la fila "+i+" columna "+j);                                  //Le pedimos por teclado los elementos a guardar en la matriz
                num=leer.nextInt();                                                                                                                         //Leemos los elementos
                matriz [i][j]=num;                                                                                                                      //Guardamos
            }
        }
        //Imprimimos lo matriz cuadrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
             System.out.println("");
        }
       
    }
    
}
