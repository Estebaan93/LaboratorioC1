/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo1;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Metodo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        ArrayList<Number>lista=new ArrayList<>();
        lista.add(new Integer(12));
        lista.add(new Double(23.4));
        lista.add(new Float(34.2));
        lista.add(new Integer(45));
        for (Number nro : lista) {
            if (nro instanceof Integer) {
                suma+=(Integer)(nro);
            }
        }
        System.out.println("La suma es : "+suma);
    }
    
}
