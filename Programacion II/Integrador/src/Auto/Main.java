/*Auto a= new Auto("xx","Chevrolet");
Auto b= a; */
package Auto;

/**
 *
 * @author Esteban
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Auto
        Auto a=new Auto("xx", "Chevrolet");
        Auto b=a;                                                   
        /*Existira un solo objeto Auto en la memoria heap, memoria dinamica; esto porque se asigna el mismo valor del objeto en el otro */
        
        System.out.println(a);
        System.out.println("");
        System.out.println(b);
        
    }
    
}
