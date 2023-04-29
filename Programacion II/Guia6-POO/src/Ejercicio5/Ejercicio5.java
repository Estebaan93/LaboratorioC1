/*5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio5 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion del objeto
        CuentaBancaria c1 = new CuentaBancaria();

        //Scanner
        System.out.println("Ingrese el numero de cuenta bancaria:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI:");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo actual:");
        double saldoActual = leer.nextDouble();
        System.out.println("Ingrese el interes:");
        double interes = leer.nextDouble();

        //Metodo crear cuenta le pedimos al usuario los datos
        c1.crearCuenta(numeroCuenta, dni, saldoActual, interes);

        //Metodo ingresar dinero, se le suma al saldo actual
        System.out.println("Cuanto dinero va ingresar:");
        double ingresar = leer.nextDouble();
        c1.ingresarDinero(ingresar);

        //Metodo retirar dinero, se le resta a saldo actual, si no le alcanza se pondra en 0
        System.out.println("Cuanto dinero va a retirar:");
        double retiro = leer.nextDouble();
        c1.retirarDinero(retiro);
          
        //Falta un metodo para comparar si saldo es 0!, y no deje continuar por no tener mas dinero. ¿¿¿Comparar objeto consultar saldo???
        c1.consultarSaldo();

        //Metodo extraccion rapida
        System.out.println("Extraccion rapida, menor al 20%");
        double rapida = leer.nextDouble();
        c1.extraccionRapida(rapida);

        //Metodo consultar saldo
        c1.consultarSaldo();

        //Metodo consultar datos con toString
        System.out.println("Sus datos son " + c1.toString());

    }

}
