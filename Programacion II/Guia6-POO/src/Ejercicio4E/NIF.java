/*4. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con sucorrespondiente letra (NIF). Los atributos serán el número de DNI 
(entero largo) y la letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, le asigna la letra que le 
corresponde según el resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente. 
La tabla de caracteres es la siguiente: */
package Ejercicio4E;

import java.util.Scanner;

/**
 *
 * @author esteban
 */
public class NIF {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");           //Importamos el scanner
    //Atributos
    private int dni;
    private char letra;

    //Get & Set
    //Métodos getters y setters para el número de DNI y la letra.
    public long getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, le asigna la letra que le 
    corresponde según el resultado del calculo.*/
    public void crearNif() {
        do {
            System.out.println("Ingrese su DNI");
            this.dni=leer.nextInt();
        } while (dni<=0);
        letra = calcularLetra();        //Mientras sea mayor a 0
    }

    //Metodo para calcular letra con el NIF
    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni % 23];    // se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22
    }

    //
    @Override
    public String toString() {
       /* return "NIF{" + "dni=" + dni + ", -" + letra + '}';*/
       
       /* La clase StringBuilder se puede utilizar cuando se desea modificar una cadena sin crear un nuevo objeto. Por ejemplo, el uso de la clase StringBuilder 
       puede aumentar el rendimiento al concatenar muchas cadenas juntas en un bucle. */
       StringBuilder sb = new StringBuilder();
        sb.append(dni);
        sb.append("-");
        sb.append(letra);
        return sb.toString();
    }

}
