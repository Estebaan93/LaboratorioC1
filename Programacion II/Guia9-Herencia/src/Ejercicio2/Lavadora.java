/*A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set del atributo carga.

• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.

• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio.  */
package Ejercicio2;

/**
 *
 * @author Esteban
 */
public class Lavadora extends Electrodomestico{
    //Atributos
    private int carga;                          //Le colocamos private porque estos atributos no se heredan
    
    
    //Constructores
    public Lavadora() {
    }
    public Lavadora(int carga, double precio, double peso, String color, char consumoEner) {
        super(precio, peso, color, consumoEner);
        this.carga = carga;
    }
    
    //Get & Set
    public int getCarga() {
        return carga;
    }
    public double getPeso() {
        return peso;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEner() {
        return consumoEner;
    }
    
    
    /**
     * • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
     */
    public void crearLavadora(){try {
           System.out.println("CREANDO LAVADORA..");
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        super.crearElectrodomentico();
        System.out.println("Ingrese la capacidad de carga del lavarropas");
        this.carga=leer.nextInt();
        System.out.println(toString());
    }
    
    /**
     * • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad
     * Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se incrementará el precio
     * Este método debe llamar al método padre y añadir el código necesario
     * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio. 
     * @return 
     */
    @Override
    public double precioFinal() {
        double plus=super.precioFinal();
        if (carga>30) {
            plus+=500;
        }
        return plus;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga de lavado=" + carga +" kg"+ ", color="+this.color+ ", peso del electrodomestico="+this.peso +" kg"+ 
                ", eficiencia energetica="+this.consumoEner+", PRECIO FINAL=$"+this.precioFinal()+ '}';
    }

    
    
}
