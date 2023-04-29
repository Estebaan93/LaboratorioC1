/*8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio8 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto
        Cadena c1 = new Cadena();
        // Se le pedirá al usuario que ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco y a través de los métodos set, se 
        //guardará la frase y la longitud de manera automática.
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        System.out.println("Longitud " + c1.getLongitud());
        //Mostramos cuantas vocales tiene
        c1.mostrarVocales();
        System.out.println("");
        //Invertimos la frase
        c1.invertirFrase();
        System.out.println("");
        //• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        System.out.println("Ingrese una letra a buscar");
        c1.vecesRepetido(leer.next());
        //• Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
        System.out.println("Ingrese otra frase para comparar la longitud con la primera");
        c1.compararLongitud(leer.next());
        //• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        System.out.println("Ingrese una nueva frase para unir");
        c1.unirFrases(leer.next());
        //• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y
        //mostrar la frase resultante.
        System.out.println("Ingrese un caracter para reemplazar a las letras: a");
        c1.reemplazar(leer.next());
        //• Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.   
        System.out.println("Ingrese una letra a buscar, V si la contiene, F si no");
        System.out.println(c1.contiene(leer.next()));
    }

}
