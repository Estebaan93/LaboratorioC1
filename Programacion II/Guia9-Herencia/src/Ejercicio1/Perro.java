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
public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }  

    @Override
    public void alimentarse() {
        if (getAlimento()=="Carnivoro") {
             System.out.println("El perro "+getNombre()+" es "+getAlimento());
        }else{
             System.out.println("El perro "+getNombre()+" se alimenta de "+getAlimento());
        }
       
    }

    
    
}
