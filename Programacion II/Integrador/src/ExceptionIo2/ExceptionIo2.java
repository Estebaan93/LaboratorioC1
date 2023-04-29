/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionIo2;

/**
 *
 * @author Esteban
 */
public class ExceptionIo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            add();
        }catch(ArithmeticException ex){
            System.out.println("Error 1");
        }
        catch (Exception ex){
            System.out.println("Error 2");
        }
        finally {
            System.out.println("Fin");
        }
    }
    public static void add() throws Exception{
        int a=3/0;
    }
    
}
