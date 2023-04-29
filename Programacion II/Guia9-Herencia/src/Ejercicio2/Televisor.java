/*Se debe crear también una subclase llamada Televisor con los 
siguientes atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.

Los constructores que se implementarán serán:
• Un constructor vacío.

• Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.

• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.

• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio. */
package Ejercicio2;

/**
 *
 * @author Esteban
 */
public class Televisor extends Electrodomestico {

    //Atributos
    private int pulgadas;                   //Le colocamos private porque estos atributos no se heredan
    private boolean sintonizador;

    //Constructor
    public Televisor() {
    }
    public Televisor(int pulgadas, boolean sintonizador, double precio, double peso, String color, char consumoEner) {
        super(precio, peso, color, consumoEner);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    //Get & Set
    public int getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    public boolean isSintonizador() {
        return sintonizador;
    }
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    /**
     * • Método crearTelevisor(): este método llama a crearElectrodomestico() de
     * la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos los atributos del televisor.
     *
     */
    public void crearTelevisor() {try {
           System.out.println("CREANDO TELEVISOR..");
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        super.crearElectrodomentico();
        System.out.println("Ingrese las pulgadas del TV");
        this.pulgadas = leer.nextInt();
        System.out.println("Desea agregar el sintonizador a la compra(S/N)?");
        String y=leer.next();
        if (y.equalsIgnoreCase("S")) {
            this.sintonizador=true;
        }
       // this.sintonizador=leer.nextBoolean();
        System.out.println(toString());
    }

   
    /**
     * • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad 
     * Si el televisor tiene una resolución mayor de 40 pulgadas, seincrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500 
     * Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
     * @return 
     */
     @Override
    public double precioFinal() {
        double plus=super.precioFinal();
         if (pulgadas>40) {
             plus+=(plus*0.3);                                       //Incremento %30
         }
         if (sintonizador==true) {
             plus+=500;
         }
        return plus;
    }

    @Override
    public String toString() {
        return "Televisor{" + "color="+this.color+ ", peso del electrodomestico="+this.peso +"kg"+", eficiencia energetica="+this.consumoEner+
                ", pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + ", precio final=$"+this.precioFinal()+'}';
    }

    
    
}
