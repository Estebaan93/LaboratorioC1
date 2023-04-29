package TP3_Lab1_C1;

import java.time.LocalDate;


public class Jubilado extends Persona {

    public Jubilado(String nombre, int dni, LocalDate nacimiento, String domicilio) {
        super(nombre, dni, nacimiento, domicilio);
    }
      

    @Override
    public void cobrar() {
        System.out.println("Cobrando mi jubilacion:");
        
    }

    

}
