/*7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
algúnotro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función
devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso 
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, para después en el main, calcular un porcentaje de esas 
4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de 
edad y cuantos menores. */
package Ejercicio7;

//import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio7 {

    //public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un vector para mis personas
        Persona[] vector = new Persona[4];
        int ideal = 0, sobre = 0, bajo = 0, mayor = 0, menor=0;                      //Variables de tipo entero
        double imc;                                                                                //Variable que me de el promedio

        // Creamos el objeto
        Persona p = new Persona();

        //Vector
        for (int i = 0; i < 4; i++) {
            vector[i] = new Persona();
            System.out.println("Para la persona " + i);
            p.crearPersona();
            imc = p.calcularImc();
            if (imc == 1) {
                sobre++;
            } else if (imc == 0) {
                ideal++;
            } else {
                bajo++;
            }
            if (p.esMayorDeEdad()) {
                mayor++;
            } else {
                menor++;
            }
            System.out.println(p.toString());
            System.out.println("");
        }
        /*  calcular un porcentaje de esas  4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un 
        porcentaje de cuantos  son mayores de edad y cuantos menores*/
        double s = sobre / 4.0*100;
        double id = ideal / 4.0*100;
        double b = bajo / 4.0*100;
        System.out.println("Hay " + s + " % personas con sobrepeso");
        System.out.println("Hay " + id + " % personas con peso ideal");
        System.out.println("Hay " + b + " % personas con bajo peso");
        System.out.println("Hay " + mayor + " personas mayores de edad");
        System.out.println("Hay "+menor+ " personas menores de edad");

        
    }

}
