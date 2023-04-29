/*23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. ¿Cómo es la transpuesta de una matriz?
 */
package Guia1_Ej_20A26;



/**
 *
 * @author Esteban
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos la matriz
        int matriz [][] = new int [4] [4];                                                 //Matriz 4x4 
        int tran  [][]= new int [4] [4];                                                          //Transpuesta
        
        //Llenado de matriz e impresion
        /*for (i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                 matriz[i][j]=  (int) (Math.random() * 50);                             //Hasta 50 aleatorios
                 System.out.print("["+matriz[i][j]+"]");                                   //Imprimimos la matriz
            }
            System.out.println("");                                                                 //Salto de linea
        }*/
        
        //Metodo para llenar matriz
        llenarMatriz(matriz, tran);                        
        
        System.out.println("Matriz original");
        mostrarMatriz(matriz);                                                                   //Llamada al metodo mostrar matriz 
        System.out.println("");
        System.out.println("Matriz transpuesta");
        mostrarMatriz(tran);                                                                  //Llamada al metodo mostrar matriz
        
    }
    //Llenado de matriz para la original y transpuesta
    public static void llenarMatriz(int matriz [][], int tran[][]) {
        int i,j;
        
         for (i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                //Matriz original
                 matriz[i][j]=  (int) (Math.random() * 50);                             //Hasta 50 aleatorios
                 //Matriz transpuesta
                 tran[j][i]= matriz[i][j];
                // System.out.print("["+matriz[i][j]+"]");                                   //Imprimimos la matriz original
            }
        }
        
    } 
    public static void mostrarMatriz(int matriz[][]) {
        int i, j;
        
         for (i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                System.out.print("["+matriz[i][j]+"]");                                 //Me va mostrar la matriz original y la transpuesta.. segun parametros que le pase al invocar
                
            } System.out.println("");
           }   
         }
    
}
