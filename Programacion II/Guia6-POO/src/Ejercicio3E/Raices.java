/*3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. Luego, las operaciones 
que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b.
 */
package Ejercicio3E;

/**
 *
 * @author Esteban
 */
public class Raices {

    //Atributos
    int a, b, c; 
    double discriminante = 0, solucion1, solucion2, solucion3;
    boolean raices, raiz;

    //Constructor con parametros
    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Constructor vacio
    public Raices() {
    }

    //Metodos
    //• Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c 
    public double getDiscriminante() {
        discriminante = (b * b) - (4 * a * c);
        return discriminante;
    }

    //• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0. 
    public boolean tieneRaices() {
        if (discriminante >= 0) {
            raices = true;
        } else {
            raices = false;
        }
        return raices;

    }

    //• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0. 
    public boolean tieneRaiz() {
        if (discriminante == 0) {
            raiz = true;
        } else {
            raiz = false;
        }
        return raiz;
    }

    //• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones. 
    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Solucion 1");
            solucion1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
            System.out.println(solucion1);
            System.out.println("Solucion 2");
            solucion2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
            System.out.println(solucion2);
        } else {
            System.out.println("No tiene soluciones");
        }
    }

    //• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("Solucion unica");
            solucion3 = (-b + (Math.sqrt(b * b - 4 * a * c))) / 2 * a;

        }
    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los 
 métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.*/
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else {
            tieneRaiz();
        }
    }

}
