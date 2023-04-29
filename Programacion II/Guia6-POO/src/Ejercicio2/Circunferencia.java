/*2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 */
package Ejercicio2;

/**
 *
 * @author Esteban
 */
public class Circunferencia {

    //Atributos del objeto
    private double radio;
    double area, perimetro;

    //Constructor vacio
    public Circunferencia() {
    }

    //Metodo crearCircunferencia
    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }

    //Constructor con parametros
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //Get & Set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   

//Metodo area
    public void cArea() {
        area = 3.14 * (radio * radio);
    }

//Metodo perimetro
    public void cPerimetro() {
        perimetro = 2 * 3.14 * radio;
    }

//Metodo imprimir
    public void imprimir() {
        cArea();
        cPerimetro();
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }

}
