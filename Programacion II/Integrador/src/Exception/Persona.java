/*Creamos el objeto persona y lanzamos una excepcion */
package Exception;

/**
 *
 * @author Esteban
 */
public class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
    
    
}
