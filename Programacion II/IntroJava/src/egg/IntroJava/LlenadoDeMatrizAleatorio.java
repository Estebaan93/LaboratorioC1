/*Llenado de matriz
 */
package egg.IntroJava;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class LlenadoDeMatrizAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int fila, col;                 
        
        //Le pedimos al usuario la fila y columna
        System.out.println("Ingrese un tamaño de la matriz fila y columna:");
        fila=leer.nextInt();                                                                                                //Guardamos la fila
        col=leer.nextInt();                                                                                                 //Guardamos la columna
        
        int matriz [][]=new int [fila][col];                                                                    //Dimensionamos la matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j]= (int)(Math. random()*50);                                                           //Aleatorio del 0 al 50
            }
            
        }
            //Imprimimos la matriz
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println("");
        }
    }
    
}
