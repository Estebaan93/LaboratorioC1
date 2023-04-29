/*3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para  leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la 
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo  int. Por ultimo realizar una división con los dos numeros y mostrar el resultado. */
package Ejercicio3;

/**
 *
 * @author Alumno
 */
public class DivisionNumero {
    //Atributos
    String n1, n2;
    int n3, n4, r;
    
    //Constructores
    public DivisionNumero() {
    }
    //Get & Set
    public void setN1(String n1) {
        this.n1 = n1;
    }
    public void setN2(String n2) {
        this.n2 = n2;
    }

     //Convertimos a int 
    public void operar(){
         n3=Integer.parseInt(n1);
         n4=Integer.parseInt(n2);
         try{
             r=n3/n4;
         }
         catch(ArithmeticException a){
             System.out.println("No se puede dividir por 0");
         }
         if (n4==0) {
             
        } else {
             System.out.println("El resultado es " + r);
         }
       
         
    }
          
}
