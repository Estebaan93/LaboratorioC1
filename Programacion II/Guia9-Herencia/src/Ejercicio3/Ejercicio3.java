/*3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor. */
package Ejercicio3;

import Ejercicio2.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double todos=0;
        // Creamos el arraylist para lavadora
        ArrayList<Lavadora> lavadoras = new ArrayList();
        Lavadora l1 = new Lavadora(50, 1000d, 30d, "rojo", 'C');     //Creamos un objeto lavadora
        Lavadora l2 = new Lavadora(25, 1500d, 40d, "azul", 'D');
        Lavadora l3 = new Lavadora(32, 940d, 12d, "gris", 'B');
        Lavadora l4 = new Lavadora(55, 1200d, 70d, "negro", 'A');
        lavadoras.add(l1);
        lavadoras.add(l2);
        lavadoras.add(l3);
        lavadoras.add(l4);
        Iterator<Lavadora>  it =lavadoras.iterator();
        try {
           System.out.println("CREANDO LAVADORAS..");
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        while(it.hasNext()){
         Lavadora aux=it.next();
         try {
             System.out.println("Carga de ropa: "+aux.getCarga()+" kg - peso: "+aux.getPeso()+" kg - color: "+aux.getColor()+" - PRECIO FINAL:$"+aux.precioFinal());
            Thread.sleep(2*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
         todos+=aux.precioFinal();
        }
        System.out.println("");
        System.out.println("PRECIO FINAL DE TODOS LOS PRODUCTOS "+ "$"+todos);
        
    }

}
