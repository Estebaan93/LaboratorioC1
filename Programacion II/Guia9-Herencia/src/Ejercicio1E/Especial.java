/*Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación. Sin embargo, se pretende diferenciar la información de 
algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler. */
package Ejercicio1E;

/**
 *
 * @author Esteban
 */
public class Especial extends Barco{
    //Atributos particular de cada barco
    private int numMastiles=4;
    private double potencia=80;
    private int numCamarotes=12;
    
    //Constructores
    public Especial() {
    }
    public Especial(int numMastiles, double potencia, int numCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
        this.valorModulo=this.valorModulo+numMastiles+potencia+numCamarotes;                            //Valor de eslora+dia+numMastiles+potencia+numCamarotes
    }
    
    //Get & Set
    public int getNumMastiles() {
        return numMastiles;
    }
    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public int getNumCamarotes() {
        return numCamarotes;
    }
    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    public void crearBarcoEspecial(){
        super.crearBarco();
    }
    
    @Override
    public String toString() {
        return "Especial{" + "numMastiles=" + numMastiles + ", potencia=" + potencia + ", numCamarotes=" + numCamarotes + super.toString()+'}';
    }
    
    
}
