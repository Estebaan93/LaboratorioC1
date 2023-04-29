/*A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener en cuenta que por cada 10 mts consume 1lt de
combustible y solo podrá avanzar si hay combustible suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos tener en cuenta que por cada 10 mts consume 1lt 
de combustible y solo podrá avanzar si hay combustible suficiente.
• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.*/
package CarreraMortal;
import static CarreraMortal.CarreraMortal.leer;
/**
 *
 * @author Esteban
 */
public class Auto {

    //Atributos
    private String color, patente;
    private double combustible;          //Inicia con 50 litros
    private Rueda rueda;

    //Contructores
    public Auto(String color, String patente, Rueda rueda) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50;
        this.rueda=rueda;
    }
    public Auto() {
    }

    public double getCombustible() {
        return combustible;
    }
    
    /*Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener en cuenta que por cada 10 mts consume 1lt de
    combustible y solo podrá avanzar si hay combustible suficiente.*/
    public void avanzar(Rueda rueda){
        System.out.println("Ingrese los metros");
        double metros=leer.nextDouble();
        if ((metros*0.1)<=combustible) {
            System.out.println("Hay combustible suficiente para avanzar ");
            combustible=combustible-(metros*0.1);
            System.out.println("Le quedan "+combustible+" lt");
        } else{
            System.out.println("No hay suficiente combustible para avanzar ");
            System.out.println("Tiene "+ combustible+" lt");
            System.out.println("Solo puede hacer "+(combustible/0.1)+" metros");
        }
    }
    /*Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos tener en cuenta que por cada 10 mts consume 1lt 
de combustible y solo podrá avanzar si hay combustible suficiente.    */
     public void retroceder(){
         System.out.println("Ingrese los metros");
        double metros=leer.nextDouble();
        if ((metros*0.1)<=combustible) {
            System.out.println("hay combustible suficiente para retroceder");
            combustible=combustible-(metros*0.1);
            System.out.println("Le quedan: "+combustible+" lt");
        } else{
            System.out.println("No hay suficiente combustible para retroceder");
            System.out.println("Tiene "+ combustible+" lt");
            System.out.println("Solo puede hacer "+(combustible/0.1)+" metros");
        }
    }
   /*LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.     */ 
    public void llenarTanque(){
        combustible=50;
    } 

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", patente=" + patente + ", combustible=" + combustible + ", rueda=" + rueda.toString()+ '}';
    }

   
    
    
}
