/*1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main */
package Ejercicio1;

/**
 *
 * @author Esteban
 */
public class Animal {
    //Atributos
    protected String nombre, alimento, raza;
    protected Integer edad;

    public Animal(String nombre, String alimento, Integer edad, String raza ) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

   //Get && Set
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String getNombre() {
        return nombre;
    }
    
    //Metodo alimentarse
    public void alimentarse(){
      }
    
}
