/* */
package Maps;

import java.util.HashMap;
//import java.util.Map;

/**
 *
 * @author Esteban
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              HashMap<Integer, String> couchs= new HashMap();
        llenarDeCouchs(couchs);//le pasamos el conjunto a la funcion
        couchs.entrySet().forEach((entry) -> { 
            System.out.println(entry.getKey() + " - " + entry.getValue());
        });
    }      
                
                
public static HashMap<Integer, String> llenarDeCouchs(HashMap<Integer, String>couchs) {
    couchs.put(1, "Ivan");
    couchs.put(1, "Laura");
    couchs.put(1, "Marcela");
    couchs.put(1, "Sofia");
    return couchs;
}
    }
