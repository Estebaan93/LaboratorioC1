/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionNum;

/**
 *
 * @author Esteban
 */
public class ExceptionNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public void noNegativo(int numero){
        if (numero<0) {
            //throw new Exception("El numero es negativo");                       //Al metodo le falta la clausula throws para avisar que este metodo
        }                                                                                                              //puede tirar una excepcion
    }
    
}
