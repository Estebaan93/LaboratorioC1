/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3_Lab1_C1;

import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author Esteban
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona j1=new Jubilado("moni", 20323123, LocalDate.of(1970, Month.MARCH, 22), "Los venados");
        Persona t1=new Trabajador(180000, "Roberto", 2700989, LocalDate.of(180, Month.APRIL, 28), "San Juan");
        Registro r1=new Registro();
        t1.calcularEdad();
        r1.procesarDatos(j1);
        r1.procesarDatos(t1);
                
                
                
    }
    
}
