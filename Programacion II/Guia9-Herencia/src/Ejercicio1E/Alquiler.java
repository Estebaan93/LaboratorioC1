/*1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, 
fecha de devolución, la posición del amarre y el barco que lo ocupará. 

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler. */
package Ejercicio1E;

import static Ejercicio1E.Ejercicio1E.leer;
import java.util.Date;
//import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Alquiler {

   // public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Atributos
    protected String nombre;
    protected long dni;
    protected Date fechaAlq = new Date();
    protected Date fechaDev = new Date();
    protected int posAmarre = 20;
    protected Barco barcoAlq;           //Tiene un barco

    //Constructores
    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, Date fechaAlq, Date fechaDev, int posAmarre, Barco barcoAlq) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posAmarre = posAmarre;
        this.barcoAlq = barcoAlq;

    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public Date getFechaAlq() {
        return fechaAlq;
    }
    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }
    public Date getFechaDev() {
        return fechaDev;
    }
    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }
    public int getPosAmarre() {
        return posAmarre;
    }
    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }
    public Barco getBarcoAlq() {
        return barcoAlq;
    }
    public void setBarcoAlq(Barco barcoAlq) {
        this.barcoAlq = barcoAlq;
    }

    public void crearAlquiler() {
        System.out.println("REGISTRO DE PERSONA");
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ingrese su DNI");
        dni = leer.nextLong();
        System.out.println("ALQUILER DE BARCO");
        System.out.println("Ingrese el dia");
        int diaa = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mesa = leer.nextInt();
        System.out.println("Ingrese el año");
        int anioa = leer.nextInt();
        System.out.println("FECHA DE DEVOLUCION");
        System.out.println("Ingrese el dia de devolucion");
        int diad = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mesd = leer.nextInt();
        System.out.println("Ingrese el año");
        int aniod = leer.nextInt();
        diferenciaDias(anioa, mesa, diaa, aniod, mesd, diad);
        barcoAlq.crearBarco();
    }

    /**
     *
     * @param anioa
     * @param mesa
     * @param diaa
     * @param aniod
     * @param mesd
     * @param diad
     * @return
     */
    public Integer diferenciaDias(int anioa, int mesa, int diaa, int aniod, int mesd, int diad) {
        fechaAlq.setYear(anioa - 1900);
        fechaAlq.setMonth(mesa - 1);
        fechaAlq.setDate(diaa);
        fechaDev.setYear(aniod - 1900);
        fechaDev.setMonth(mesd - 1);
        fechaDev.setDate(diad);
        int milisecondsByDay = 86400000;                                    //Milisegundos en un dia
        int dife = (int) ((fechaDev.getTime() - fechaAlq.getTime()) / milisecondsByDay);
        return dife;
    }

    //toString 
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", posicion de amarre=" + posAmarre + ", barcoAlq=" + barcoAlq + '}';
    }

}
