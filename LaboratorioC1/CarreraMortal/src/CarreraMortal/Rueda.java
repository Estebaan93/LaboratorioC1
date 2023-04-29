/*B- Hacer la clase Rueda, con atributo marca y presión, Luego el auto debe tener 4 ruedas, y desde el main el auto debe crear las instancias, e inflar sus 
ruedas.
• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI
C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas, avanzar/retroceder, y llenarTanque */
package CarreraMortal;

/**
 *
 * @author Esteban
 */
public class Rueda {
    //Atributos
    private String marca;
    private double presion;
    
    //Constructores
    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }
    public Rueda() {
    }
    /*Inflar: la presión regresa a 28.0 PSI    */
    public void inflar(){
        this.presion=28.0;       
    }
    /*Pinchar: se debe reducir la presión al mínimo.    */
    public void pinchar(){
        this.presion=0.0;
    }
    /*Desinflar: reduce la presión de la rueda -0.5 PSI    */
    public void desinflar(){
        this.presion=0.5;
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + ", presion=" + presion + '}';
    }

    

    
}
