package Celular;

import Celular.Chip;
import Celular.Bateria;

public class Celular {
    //Atributos
    private String modelo;
    private Chip [] chips;                               //Vector de con 2 numeros de chip
    private Bateria bateria;                    //Celular tiene una bateria
    private int nroChip;

    //Constructor
    public Celular(String modelo, String marca, double potencia) {
        this.modelo=modelo;
        bateria=new Bateria(marca, potencia);
        nroChip=0;                                                          //No tiene un numero
        chips=new Chip[2];                                          //El celular solo puede tener hasta 2 numeros, 2 ranuras 
    }
    //Get & Set
    public void setNroChip(int nroChip) {
        this.nroChip = nroChip;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Chip[] getChips() {
        return chips;
    }
    public void setChips(Chip[] chips) {
        this.chips = chips;
    }
    public Bateria getBateria() {
        return bateria;
    }   
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    public int getNroChip() {
        return nroChip;
    }

    //Agregamos chip
    public void agregarChip(Chip nuevoChip){
        //Solo puedo agregar hasta 2 chips
        if (nroChip<2) {
            chips[nroChip]= nuevoChip;
            nroChip++;
        } else{
            System.out.println("No hay espacio para otro chip");
        }
    }
            
            
    //Mostramos el chip, en caso de que haya uno    
    public void mostrarChip(){
        for (int i = 0; i < nroChip; i++) {               //Hasta la posicion 2, con sus 2 ranuras
            System.out.println("El chip tiene numero"+ chips[i].getNumero()+ " y pertenece a la empresa "+ chips[i].getEmpresa());
        }
    }

    @Override
    public String toString() {
        return "Celular{" + "modelo=" + modelo + ", bateria=" + bateria + ", nroChip=" + nroChip + '}';
    }
    
    
    
}
