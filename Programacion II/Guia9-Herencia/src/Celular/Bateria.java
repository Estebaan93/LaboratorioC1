package Celular;

public class Bateria {
    //Atributos
    private String marca;
    private double potencia;

    //Constructor

    public Bateria(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }
    
    //toString 

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }
    
}
