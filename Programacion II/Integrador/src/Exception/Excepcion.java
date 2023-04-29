/*Creamos un objeto persona y lanzamos una excepcion */
package Exception;

/**
 *
 * @author Esteban
 */
public class Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto persona
        Persona p1=new Persona();
        String nombre=null;                                         //Guardamos null en la variable
        try{
            if (!nombre.equals(null)) {                         //Si es diferente de null, no entra a setNombre. 
                p1.setNombre(nombre);                          //Salta al catch
            }
        } catch (Exception e){                                                              //Captura el error Exception
            System.out.println("El nombre no puede ser nulo");              //Muestra el mensaje
        }    
        
    }
    
}
