/*4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado  puede causar una excepción de tipo InputMismatchException, el método 
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un número por cero surge una 
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques try/catch para las distintas excepciones */
package Ejercicio4;

import java.util.InputMismatchException;

/**
 *
 * @author Alumno
 */
public class Excepcion {
    //Atributos
    String num, num2;
    int n1,n2,n3,n4,r,r1;
    
    //Constructor

    public Excepcion() {
    }
    
    //Get & Set
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getNum2() {
        return num2;
    }
    public void setNum2(String num2) {
        this.num2 = num2;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN3() {
        return n3;
    }
    public void setN3(int n3) {
        this.n3 = n3;
    }
    public int getN4() {
        return n4;
    }
    public void setN4(int n4) {
        this.n4 = n4;
    }
    
        //Metodo operaciones numericas
    public void operar(){
        try{
             n1=Integer.parseInt(num);
            n2=Integer.parseInt(num2);
            r=n1/n2;
           // r1=n3/n3;
            System.out.println("El resultado es: "+r);
        } 
        //InputMismatchException >> error producido cuando queremos almacenar un punto, coma, caracter en un avariable numerica
       catch (NumberFormatException n){
            System.out.println("La cadena no puede convertirse a entero");
        } catch(ArithmeticException a){
            System.out.println("No se puede dividir por 0");
        }
       
                
    }
    
    
}
