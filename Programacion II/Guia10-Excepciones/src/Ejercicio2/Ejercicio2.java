/*2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para generar y capturar una excepción 
ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango). */
package Ejercicio2;

/**
 *
 * @author Alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num [] = {1,2,3,4};             //Vector de 3 indices
        // System.out.println("El numero de la posicion 4 es: "+num[4]); 
        try {
        System.out.println("El numero de la posicion 4 es: "+num[4]);       //En la posicion 4, indice 4
    }
        catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe!");
        }
    }
    
}
