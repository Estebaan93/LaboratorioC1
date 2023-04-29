/*12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
Y los siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
     crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que 
    la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.  Tener en cuenta que para conocer la edad de la persona también se debe conocer 
    la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método anterior. */
package Ejercicio12;

import java.util.Date;

/**
 *
 * @author Esteban
 */
public class Persona {
    //Atributos de la clase
    private String nombre;
     long edad;
    //Atributos tipo date
    Date fechaNacimiento=new Date();
    Date fechaActual=new Date();
   

    //Constructor vacio
    public Persona() {
    }
    //Constructor con parametros
    public Persona(String nombre, long edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Get & Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Date getFechaActual() {
        return fechaActual;
    }
    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }
    public long getEdad() {
        return edad;
    }
    public void setEdad(long edad) {
        this.edad = edad;
    }
   
    /* crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, 
    recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.  */
    public void crearPersona(String nombre, int anio,int mes,int dia){
        this.nombre=nombre;
        //Lo guardamos en el date
        fechaNacimiento.setYear(anio-1900);
        fechaNacimiento.setMonth(mes-1);
        fechaNacimiento.setDate(dia);
    }
    /* método calcularEdad() a partir de la fecha de nacimiento ingresada.  Tener en cuenta que para conocer la edad de la persona también se debe conocer 
    la fecha actual.
    */
    public void calcularEdad(){
        edad=fechaActual.getYear()-fechaNacimiento.getYear();
         System.out.println(nombre+" tiene "+edad+" años");
    }
    /*clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga menor edad que la
    persona que se recibe como parámetro, o false en caso contrario. */
    public boolean menorQue(int menor){
        return (edad<menor);
    }
    
    /*Metodo mostrarPersona(): este método muestra la persona creada en el método anterior  
    */
    public void mostrarPersona(){
        System.out.println(fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", fechaActual=" + fechaActual + ", edad=" + edad + '}';
    }
    
}
