/*En java se dice que una clase es abstracta cuando no se permiten instancias de esa clase, es decir que no se pueden crear objetos. 
Un método abstracto es un método declarado, pero no implementado, es decir, es un  método del que solo se escribe su nombre, parámetros, y tipo devuelto, 
pero no su código de implementación. Estos métodos se heredan y se sobreescriben por las clases hijas quienes son las responsables de implementar 
sus funcionalidades. ¿Qué utilidad tiene un método abstracto? Podemos ver un método abstracto como una palanca que fuerza dos cosas: la primera,
que no se puedan crear objetos de una clase. La segunda, que todas las subclases sobreescriban el método declarado como abstracto. */
package Libro;

/**
 *
 * @author Esteban
 */
public class Ejemplar  extends Libro{

    //@Override
    public void informar() {
        System.out.println("Soy un ejemplar");
    }
   
    
}
