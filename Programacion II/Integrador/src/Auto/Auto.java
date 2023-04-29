/* Creamos un objeto Auto */
package Auto;

/**
 *
 * @author Esteban
 */
public class Auto {
    //
    String modelo;
    String marca;

    public Auto(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + ", marca=" + marca + '}';
    }
    
    
    
    
}
