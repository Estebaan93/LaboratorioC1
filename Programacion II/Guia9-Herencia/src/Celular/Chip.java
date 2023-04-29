package Celular;

public class Chip {
    //Atributos
    private String empresa;
    private int numero;

    //Constructor  
    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }
    
    //Get

    public String getEmpresa() {
        return empresa;
    }
    public int getNumero() {
        return numero;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Chip{" + "empresa=" + empresa + ", numero=" + numero + '}';
    }
    
}
