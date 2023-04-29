/* */
package ReyLeon;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class ReyLeon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        ArrayList coleccion=new ArrayList();            //Coleccion de tipo objeto, puede almacenar cualquier tipo
        coleccion.add("Simba");
        coleccion.add("Timon");
        coleccion.add("Pumba");
        coleccion.add("Mufasa");
        coleccion.add("Scar");
        Object arreglo[];
        arreglo = coleccion.toArray();
        for (Object o : arreglo) {
            System.out.println(o);
            if (o.equals("Scar")) {
                System.out.println("Encontre a Scar");
            }
            coleccion.remove("Mufasa");
            System.out.println("");
            for (Iterator it=coleccion.iterator(); it.hasNext();)
                
                System.out.println(it.next());
        }

        
        
        
    }
    
}
