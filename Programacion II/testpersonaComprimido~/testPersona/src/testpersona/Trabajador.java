
package testpersona;

import java.time.LocalDate;

/**
 *
 * @author SE31452
 */
public class Trabajador extends Persona{

    public Trabajador(String nombre, int dni, LocalDate fechaDeNac, String domicilio) {
        super(nombre, dni, fechaDeNac, domicilio);
    }

    @Override
    public void cobrar() {
        System.out.println("");
    }
    

}
