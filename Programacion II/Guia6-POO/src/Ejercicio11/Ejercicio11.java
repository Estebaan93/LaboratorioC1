/*Clase Date
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la clase Date. En este ejercicio deberemos instanciar en el main, 
una fecha usando la clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede conseguir instanciando un 
objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle */
package Ejercicio11;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio11 {
public static Scanner leer= new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del objeto
        Fecha f1=new Fecha();
        //Variables
        int dia, mes, anio;
        do {
            System.out.println("Ingrese un dia");
            dia=leer.nextInt();
            System.out.println("Ingrese un mes");
            mes=leer.nextInt();
            System.out.println("Ingrese un año");
            anio=leer.nextInt();
        } while (anio>2022 || mes>12 || dia >31);
        
         //Creamos el objeto tipo Date
        Date fechaNacimiento = new Date();         
        
        fechaNacimiento.setDate(dia);                            //Seteamos el dia
        fechaNacimiento.setMonth(mes);                      //Seteamos el mes
        fechaNacimiento.setYear(anio-1900);              //Seteamos el año
        f1.llenarFechaNacimiento(fechaNacimiento);
       // f1.mostrarFecha();
        f1.diferencia();
        //toString
        System.out.println(f1);
        
        
    }
    
}
