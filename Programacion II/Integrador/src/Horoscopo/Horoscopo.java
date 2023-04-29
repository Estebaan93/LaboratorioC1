/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Horoscopo;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Horoscopo {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String horoscopo="";
        int anyo=leer.nextInt();
        int resto=anyo%12;
        switch (resto) {
            case 0:
                horoscopo="Mono";break;
            case 1:
                horoscopo="Gallo";
            case 2:
              horoscopo="Perro";break;
            case 3:
               horoscopo="Cerdo";break;
            case 4:
               horoscopo="Rata";
            
        }
        System.out.printf("%nAño %d, corresponde a %s del horoscopo chino", anyo, horoscopo);
    }
    
}
