/*4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas geométricas, en este caso un circulo y un rectángulo. 
Ya que este calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos para 
calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2 */
package Ejercicio4;

/**
 *
 * @author Esteban
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos las formas y se mostrara el resultado final
        System.out.println("Creamos un circulo de radio 4");
        Circulo circulo=new Circulo(4.0);
        System.out.println(circulo.toString());
        System.out.println("Area "+circulo.calcularArea().toString());
        System.out.println("Perimetro "+ circulo.calculaPerimetro().toString());
        System.out.println("");
        System.out.println("Creamos el rectangulo base 5, altura 2");
        Rectangulo rectangulo=new Rectangulo(5.0, 2.0);
        
        System.out.println(rectangulo.toString());
        System.out.println("Area "+ rectangulo.calcularArea().toString());
        System.out.println("Perimetro "+ rectangulo.calculaPerimetro().toString());
    }
    
}
