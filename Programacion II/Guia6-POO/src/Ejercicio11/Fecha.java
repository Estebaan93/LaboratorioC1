/*Clase Date
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la clase Date. En este ejercicio deberemos instanciar en el main, 
una fecha usando la clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede conseguir instanciando un 
objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package Ejercicio11;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Esteban
 */
public class Fecha {
 private Date fechaNacimiento;           //Atributo tipo Date

    public Fecha(Date fechaNacimiento) {
        this.fechaActual = new Date();
        this.fechaNacimiento = fechaNacimiento;
    }

    public Fecha() {
        this.fechaActual = new Date();         //Fecha actual
        fechaNacimiento=new Date();       // Esto es para que no se cree la fecha en null 
    }
    Date fechaActual;

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
  public void llenarFechaNacimiento (Date fechaNacimiento){
      this.fechaNacimiento=fechaNacimiento;                                     //Lo guardamos en el constructor del objeto date
  }

  public void mostrarFecha(){
      System.out.println("Dia: "+fechaNacimiento.getDate());
      System.out.println("Mes: "+fechaNacimiento.getMonth());
      System.out.println("Año: "+fechaNacimiento.getYear());
  }
  
  //Diferencias entre fechas, pasamos a un entero largo para calcular
public void diferencia(){
     long diferenciaAnio = fechaActual.getYear()-fechaNacimiento.getYear();
     long diferenciaMes=fechaActual.getMonth()-fechaNacimiento.getMonth();
     long diferenciaDia=fechaActual.getDate()-fechaNacimiento.getDate();
    System.out.println(diferenciaAnio+" años");
    System.out.println(diferenciaMes+" meses");
    System.out.println(diferenciaDia+" dias");
}

//Imprimimos el objeto con formato tipo date, tambien se puede darle otro formato segun el usuario quiera!!!!
    @Override
    public String toString() {
        return "Fecha{" + "fechaNacimiento=" + (fechaNacimiento) + ", fechaActual=" + fechaActual + '}';
    }

    
    
   
    
    
    
}
