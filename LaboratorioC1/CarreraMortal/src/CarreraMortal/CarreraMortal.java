/*Nos piden modelar un Auto con las siguientes características y comportamiento para poder ser anexado al proyecto.
A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener en cuenta que por cada 10 mts consume 1lt de
combustible y solo podrá avanzar si hay combustible suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos tener en cuenta que por cada 10 mts consume 1lt 
de combustible y solo podrá avanzar si hay combustible suficiente.
• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.
B- Hacer la clase Rueda, con atributo marca y presión, Luego el auto debe tener 4 ruedas, y desde el main el auto debe crear las instancias, e inflar sus ruedas,
• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI
C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas, avanzar/retroceder, y llenarTanque */
package CarreraMortal;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class CarreraMortal {
public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda r=new Rueda();
        r.desinflar();
        Auto a= new Auto("Blanco", "203g", r);
        a.avanzar(r);
        System.out.println(a.toString());
        
        
        
    }
    
}
