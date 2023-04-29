/*8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package Guia1Extras;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio8E {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Varibales
        int n, cantNros = 0, cPares = 0, cImpares = 0, multCinco;
        System.out.println("Ingrese un numero");
        n=leer.nextInt();
        multCinco=n %5;
        while(!(multCinco==0)){
            cantNros++;
            if (n%2==0) {
                cPares++;
            } else{
                cImpares++;
            }
            System.out.println("Ingrese otro numero");
            n=leer.nextInt();
            multCinco=n %5;
            if (multCinco==0) {
                System.out.println("Se capturo un multplo de 5");
            }
        }
        System.out.println("La cantidad de numeros leidos: "+ cantNros);
        System.out.println("La cantidad de numeros pares: "+ cPares);
        System.out.println("La cantidad de numeros impares: "+ cImpares);
        
        
    }
    
}
