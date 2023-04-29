/*1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el método esMayorDeEdad() a través de ese objeto. 
Luego, englobe el código con una cláusula try-catch para probar la nueva excepción que debe ser controlada */
package Ejercicio1;

/**
 *
 * @author Esteban
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto persona null
        Persona  p1=null;
        
      // p1.esMayorDeEdad();
        try{
        p1.esMayorDeEdad();    
        }
        catch(Exception e){                  //Se captura la excepcion
            System.out.println("No se puede saber si es mayor de edad, el objeto persona esta vacio!!!");          //Mandamos un mensaje
        }
        //Ademas se puede tambien invocar otra parte del codigo, llamar a otros metodos y no se detenga la ejecucion, etc.
    }
    
}
