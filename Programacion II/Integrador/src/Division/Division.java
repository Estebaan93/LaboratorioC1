/*Division con un bucle */
package Division;

/**
 *
 * @author Esteban
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Compila, e imprime 1,1,1,1....
        
        int x=1;
        while(x<=10){
            if (x % 2 !=0) {
                System.out.println(x);
            }
        }
        
    }
}
