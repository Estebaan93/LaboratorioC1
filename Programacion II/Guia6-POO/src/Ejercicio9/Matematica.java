/*Método Static y Clase Math 
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase 
deber tener un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran
en el objeto con su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor.
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Ejercicio9;

/**
 *
 * @author Esteban
 */
public class Matematica {
    //Atributos de forma static; ocupa un solo lugar en memoria, es decir si se poseen multiples instacias del atributos, no se generara una copia de cada uno. Si no que
    //se redireccionan todos hacia la misma variable y un solo objeto y/o instacia que lo modifique lo hara para el resto.
    private static double n1, n2;
    
    //Constructor vacio
    public Matematica() {
    }
     //Constructor con parametros, los elementos estáticos pertenecen a la clase. Por lo tanto, la mejor manera de acceder a ellos es a través de la clase.
    public Matematica(double n1, double n2){
        Matematica.n1=n1;
        Matematica.n2=n2;
    }
    //Get & Set

    public double getN1() {
        return Matematica.n1;
    }

    public void setN1(double n1) {
        Matematica.n1 = n1;
    }

    public double getN2() {
        return Matematica.n2;
    }

    public void setN2(double n2) {
        Matematica.n2 = n2;
    }
    
    //Metodos
    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor.
    public double devolverMayor(){
         if (Matematica.n1<Matematica.n2) {
              System.out.print("El valor 2 es mayor ");
              return Math.max(Matematica.n1, Matematica.n2);
        } else {
              System.out.print("El valor 1 es mayor ");
              return Math.max(Matematica.n1, Matematica.n2);
          }
        // return Math.max(n1, n2);
    }
    //• Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(){
        //Redondeamos ambos numeros
        double n3=Math.round(Matematica.n1);
        double n4=Math.round(Matematica.n2);
        System.out.println("Valor 1 "+n3);
        System.out.println("Valor 2 "+n4);
        if (n3<n4) {
            System.out.println(n4+" elevado a "+n3+" es "+Math.pow(n4, n3));
        }else{
            System.out.println(n3+" elevado a "+n4+" es "+Math.pow(n3, n4));
        }
    }
    
    //Mejoramos el codigo.. Falta terminar
    public double calcularPotencia1(){
        //Redondeamos ambos numeros
        Math.pow(Math.round(n1), n1);
        return 0;
    }
    //• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calcularRaiza(){
        //Valor absoluto, es pasar a positivo
        double n3=Math.abs(Matematica.n1);
        double n4=Math.abs(Matematica.n2);
        if (n3<n4) {
            System.out.println("La raiz cuadrada de "+n3+" es "+Math.sqrt(n3));
        }else{
            System.out.println("La raiz cuadadra de "+n4+" es "+Math.sqrt(n4));
        }
       
    }
    
}
