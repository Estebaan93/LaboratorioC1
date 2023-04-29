/*21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener 
una cantidad de aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y
2 por parciales. Las ponderaciones de cada nota son: 
Primer trabajo práctico evaluativo 10% 
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25% 
Segundo integrador 50% 
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de 
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.*/
package Guia1Extras;

import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio21E {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double tp1, tp2, primInte, segInte;
        double promedio;
        //Arreglo de tamaño de 10 elementos
        double[] vector = new double[10];
        //Bucle for para llenado del array
        for (int j = 0; j < vector.length; j++) {
            System.out.println("Cargamos las notas para el alumno " + (j + 1));
            System.out.println("Ingrese la nota para el TP1:");
            tp1 = leer.nextDouble();
            while (!(tp1 >= 0 && tp1 <= 10)) {                                          //Condicion si no esta entre 0 y 10
                System.out.println("Nota incorrecta, ingrese nuevamente del 0 a 10");
                tp1 = leer.nextDouble();
            }
            System.out.println("Ingrese la nota para el TP2:");
            tp2 = leer.nextDouble();
            while (!(tp2 >= 0 && tp2 <= 10)) {                                          //Condicion si no esta entre 0 y 10
                System.out.println("Nota incorrecta, ingrese nuevamente del 0 a 10");
                tp2 = leer.nextDouble();
            }
            System.out.println("Ingrese la nota del primer parcial:");
            primInte = leer.nextDouble();
            while (!(primInte >= 0 && primInte <= 10)) {                        //Condicion si no esta entre 0 y 10
                System.out.println("Nota incorrecta, ingrese nuevamente del 0 a 10");
                primInte = leer.nextDouble();
            }
            System.out.println("Ingrese la nota del segundo parcial");
            segInte = leer.nextDouble();
            while (!(segInte >= 0 && segInte <= 10)) {                                //Condicion si no esta entre 0 y 10
                System.out.println("Nota incorrecta, ingrese nuevamente del 0 a 10");
                segInte = leer.nextDouble();
            }
            /**
             * Promediamos con el 10% del tp1, con el 15% del tp2, con el 25%
             * del primer integrador y 50% del segundo integrador, guardamos los
             * promedios de cada alumno en el array.
             */
            promedio = ((10 * tp1) / 100) + ((15 * tp2) / 100) + ((25 * primInte) / 100) + ((50 * segInte) / 100);
            vector[j] = promedio;
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 7) {
                System.out.println("Aprueba");
                System.out.println("[" + vector[i] + "]");
            } else {
                System.out.println("No aprueba");
                System.out.println("[" + vector[i] + "]");
            }

        }

    }

}
