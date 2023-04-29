/*Clase Arrays 
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también 
reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los 
primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado
de 50 elementos y el combinado de 20. 
 */
package Ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Esteban
 */
public class Array {
    //Atributos
    private final double vectorA[] = new double[50];
    private final double vectorB[]= new double[20];
    //Llenamos el vector aleatorio
    public void llenar(){
        //Llenamos el vectorA
        for (int i = 0; i <vectorA.length; i++) {
            vectorA[i]=Math.random();
        }
    }
    //Mostramos el vector

    public void  mostrarVector(){
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("["+vectorA[i]+"]");
        }
    }
    //Ordenamos el vector de menor a mayor
    public void ordenar(){
        for (int i = 0; i < vectorA.length; i++) {
            Arrays.sort(vectorA);
        }
    }
    //Copiamos los 10 primeros numeros al arreglo B, y los ultimos 10 de 0,5.
    public void copia(){
        //Copiamos los primeros 10 elementos
        System.arraycopy(vectorA, 0, vectorB, 0, 10);
       //Falta calcular los ultimos 10 valores
        double j=0.5;
        //Copiamos los ultimos 10 elementos con valor 0,5
       Arrays.fill(vectorB,10,20,j);
       for (int i = 0; i < vectorB.length; i++) {
            System.out.println("["+vectorB[i]+"]");
        }
       /*
       for (int i=0;  "i"=<this.vectorB.length;i++){
    //if(i>=0 && i<9){
        //this.vectorB[i]=this.vectorA[i];
    //}else{
        //this.vectorB[i]=0.5;
for (int i = 0; i < 10; i++){
           
            vectorB[i] = vectorA[i];
    
        }
        Arrays.fill(vectorB, 10, vectorB.length, 0.5);

       */
    }

    
    
    
}