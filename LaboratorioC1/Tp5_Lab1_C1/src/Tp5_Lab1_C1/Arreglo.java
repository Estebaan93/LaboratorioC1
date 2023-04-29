package Tp5_Lab1_C1;

/**
 *
 * @author Esteban
 */
public class Arreglo {
    //EJERCICIO A
    public static void sumarLista(int [] vector ){
        int suma = 0;
        double promedio=0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i]+Math.random()*10;
            promedio=suma/vector.length;
        }
        System.out.println("La suma es:"+suma);
        System.out.println("El promedio es: "+ promedio);
    }
    //EJERCICIO B
    public static int buscarMayor(int [][] arreglo){
        int mayor=-1000;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if(mayor<arreglo[i][j]){
                    mayor=arreglo[i][j];
                }
            }
           
        }
     return mayor;
    }
    
    
}
