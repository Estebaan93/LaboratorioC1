/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orange;

/**
 *
 * @author Esteban
 */

class Oranges {
    private static int myOrange( ) {
    int orange=0;
    try{++orange;
        orange+=Integer.parseInt("A");
        orange++;
        System.out.println("Oranges A: "+ orange);
    }catch(NumberFormatException e) {
     orange += Integer.parseInt("N");
     System.out.println("Oranges N: " + orange);
    }finally {
        orange++; System.out.println("Finally Orange:" + orange);
    }++orange;
    System.out.println("Oranges return: " + orange);
    return orange;
    }

   
public static void main (String[] args) {
    try{
        System.out.println(myOrange());
    }catch (Exception e) {
       System.out.println("Excepcion Naranja !! ");
       e.printStackTrace();
    }
  }    
}
  
