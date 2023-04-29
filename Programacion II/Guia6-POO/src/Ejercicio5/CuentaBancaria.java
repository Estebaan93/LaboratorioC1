/*5.Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
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
public class CuentaBancaria {

    //Atributos
    private int numeroCuenta;
    private long dni;
    private double saldoActual, interes;                        //Para que sirve el interes????

    //Constructor por defecto 
    public CuentaBancaria() {
    }

    //Constructor con parametros
    public CuentaBancaria(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //Get & Set
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //Metodo crear cuenta
    public void crearCuenta(int numeroCuenta, long dni, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //Metodo ingresar dinero
    public double ingresarDinero(double ingresar) {
        return saldoActual = saldoActual + ingresar;
    }

    //Metodo retirar dinero, se le resta a saldo actual, si no le alcanza se pondra en 0
    public double retirarDinero(double retiro) {
        if (saldoActual < retiro) {
            saldoActual = 0;
        } else {
            saldoActual = (saldoActual - retiro);
        }
        return saldoActual;
    }

    //Metodo extraccion rapida
    public double extraccionRapida(double rapida) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        double veintePorCiento = saldoActual * 20 / 100;
        double rapida1=rapida;
        while (rapida1 > veintePorCiento) {
            System.out.println("Su saldo actual es: " + saldoActual);
            System.out.println("Supero el 20% de su saldo");
            System.out.println("Ingrese nuevamente su extraccion");
            rapida1=leer.nextDouble();
        }
        saldoActual = (saldoActual - rapida1);
        return saldoActual;
    }

     //Metodo consultar saldo
        public void consultarSaldo(){
            System.out.println("Su saldo actual es $ "+ saldoActual);
        }
    
        //Metodo consultar datos de la cuenta

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=$" + saldoActual + ", interes=$" + interes + '}';
    }
        
}
