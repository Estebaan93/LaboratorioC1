/*3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. Luego, las operaciones 
que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c.
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b  
 */
package Ejercicio3E;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio3E {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        /* System.out.println("Ingrese el valor para A, B y C");
        a=leer.nextDouble();
        b=leer.nextDouble();
        c=leer.nextDouble();*/
        Raices r = new Raices(1, -5, 6);
        //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c.
        System.out.println("Obtenemos el discriminante:");
        System.out.println(r.getDiscriminante());                            //Obtenemos el discriminante
        //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0. 
        System.out.println("Verificamos las soluciones");
        if (r.tieneRaices() || r.tieneRaiz()) {
            if (r.tieneRaices()) {                                                              //Verificamos si tiene soluciones
                System.out.println("Tiene 1 o mas soluciones");
            } 
            //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0. 
            if (r.tieneRaiz()) {
                System.out.println("Tiene una unica solucion");
            } 
        } else{
            System.out.println("No tiene soluciones");
        }
        System.out.println("");
        r.calcular();

    }

}
