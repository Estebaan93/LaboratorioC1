/*La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite
inicializar su carga y los métodos get y set para dicho atributo.
*/
package Tp1_Lab1_C1;

public class Bateria {
    private int carga;
    
    //Constructor
    public Bateria(int carga) {
        this.carga = 1000;      //Inicializamos con bateria de 1000
    }
    
//Atributos
        //Get&Set
    public int getEnergia() {
        return carga;
    }
    public void setEnergia(int energia) {
        this.carga = energia;
    }
    
    
}
