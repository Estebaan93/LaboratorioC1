/*VECTORES Y MATRICES
20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
*/
package Guia1_Ej_20A26;

/**
 *
 * @author Esteban
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el vector de tipo entero
        int tam=100;
        int [] vector =new int [tam];                                                 //Dimension de 100
        
        LlenarVector(vector, tam);                                                  //Metodo Llenar Vector
        MostrarVector(vector,tam);                                                //Metodo Mostrar Vector
        
    }
    public static void LlenarVector(int [] vector, int tam) {
        //Bucle for/para 
        for (int i=0; i<100; i++){
            vector[i]=i+1;                              //Llenado del vector con un contador +1.
        }
        
    }
    public static void MostrarVector(int []vector, int tam) {
        //Bucle for lectura de derecha a izquierda, de esta forma se obtiene en forma decreciente/descendente.
        for (int i=100-1; i>=0; i--){
            System.out.print("["+vector[i]+"]"); 
        }
    }
}
