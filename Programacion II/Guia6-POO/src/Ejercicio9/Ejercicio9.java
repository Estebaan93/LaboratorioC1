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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del objeto
        Matematica m1=new Matematica ();
        //Generamos los numeros aleatorios
        m1.setN1(Math.random()*101);
        m1.setN2(Math.random()*101);
        System.out.println("Valor numero 1: "+m1.getN1());
        System.out.println("Valor numero 2: "+m1.getN2());
        //Metodos
        //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor.
        System.out.println(m1.devolverMayor());
        //• Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
        System.out.println("Redondeamos y elevamos el mayor valor al menor");
        m1.calcularPotencia();
        //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        System.out.println("Raiz cuadrada del menor valor");
        m1.calcularRaiza();
    }
    
}
