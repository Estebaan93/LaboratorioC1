/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el 
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el 
perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio4;

/**
 *
 * @author Esteban
 */
public class Rectangulo {
    //Atributos
    private int base, altura;

    //Constructor vacio
    public Rectangulo() {
    }

    //Constructor con parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Get & Set
    public int getBase() {                                      //Me devuelve el valor
        return base;
    }

    public void setBase(int base) {                         //Modifica valor
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Crear rectangulo
    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodo calcular superfice=base*altura
    public int cSuperfice() {
        return  base * altura;
    }

    //Metodo calcular perimetro=(base+altura)*2
    public int cPerimetro() {
        return  (base + altura) * 2;
    }

    //Dibujar rectangulo
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }

    //Metodo imprimir superficie, perimetro y dibujo del rectangulo
    public void imprimir() {
        System.out.println("La superfice del rectangulo es: " + cSuperfice());
        System.out.println("El perimetro del rectangulo es: " + cPerimetro());
        System.out.println("El dibujo del rectangulo:");
        dibujarRectangulo();
    }

}
