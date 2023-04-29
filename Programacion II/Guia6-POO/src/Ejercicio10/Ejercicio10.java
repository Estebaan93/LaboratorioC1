/*Clase Arrays 
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también 
reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los 
primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado
de 50 elementos y el combinado de 20. 
 */
package Ejercicio10;



/**
 *
 * @author Esteban
 */

public class Ejercicio10 {
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // Creamos el objeto
        Array a1 = new Array();
        //Llenamos el vector A aleatorio
        System.out.println("Se lleno el vector aleatoriamente");
        a1.llenar();
        //Mostramos el vector A
        System.out.println("Mostramos el vector");
        a1.mostrarVector();
        System.out.println("");
        //Ordenamos de menor a mayor
        System.out.println("Ordenamos de menor a mayor");
        a1.ordenar();
        a1.mostrarVector();
        System.out.println("");
        //Copiamos al vector B
        System.out.println("Los 10 primeros elementos ordenados y los ultimos 10 con valor 0,5");
        a1.copia();
        
    }

}
