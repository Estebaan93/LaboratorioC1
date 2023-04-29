package TP3_Lab1_C1;

import java.time.LocalDate;


public class Trabajador extends Persona implements Activo {

   private double sueldo;

    public Trabajador(double sueldo, String nombre, int dni, LocalDate nacimiento, String domicilio) {
        super(nombre, dni, nacimiento, domicilio);
        this.sueldo = sueldo;
    }
   

   
   
    public Trabajador() {
    }

   @Override
    public void cobrar() {
        System.out.println("Monto a cobrar:");
        
        
    }

    public void set() {
    }

    public int get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hacerAportes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Trabajador{" + "sueldo=" + sueldo + '}';
    }
    
    
}

