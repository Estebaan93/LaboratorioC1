/*3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Ejercicio3;

/**
 *
 * @author Esteban
 */
public class Operacion {

    //Atributos
    private double numero1, numero2, sum, rest, mult, div;                                                                           //Variables de tipo double privado
    private int c = 0, d = 0;

    //Constructor vacio
    public Operacion() {
    }

    //Constructor con parametros
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Get & Set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Metodo crear opereacion
    public void crearOperacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Suma
    public void suma() {
        sum = numero1 + numero2;
    }

    //Resta
    public void resta() {
        rest = numero1 - numero2;
    }

    //Multiplicacion
    public void multiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error no se puede multiplicar por 0");
        } else {
            mult = numero1 * numero2;
            c = 1;                                                                                                                //Centinela
        }
    }

    //Division
    public void division() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error no se puede dividir por 0");
        } else {
            div = numero1 / numero2;
            d = 1;                                                                                                            //Centinela
        }
    }

//Metodo imprimir
    public void imprimir() {
        suma();
        System.out.println("La suma es: " + sum);
        resta();
        System.out.println("La resta es: " + rest);

        multiplicacion();
        //Me indica que imprimir, sin esta condicion se imprimen tanto el metodo multiplicacion y cuando concatenamos mult. Solo pasa cuando es 0
        if (c == 1) {
            System.out.println("La multiplicacion es: " + mult);
        }

        division();
        //Me indica que imprimir, sin esta condicion se imprimen tanto el metodo division y cuando concatenamos div. Solo pasa cuando es 0.
        if (d == 1) {
            System.out.println("La division es: " + div);
        }
    }

}
