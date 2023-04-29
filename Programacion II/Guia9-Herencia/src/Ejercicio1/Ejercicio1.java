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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion del objeto
        Animal perro=new Perro("Stich","Carnivoro",15,"Doberman");
        perro.alimentarse();
        
        //Otro perro
        System.out.println("");
        Perro perro1=new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.alimentarse();
        System.out.println("");
        
        //Objeto gato
        Animal gato=new Gato("Pelusa","Galletas",15,"Siames");
        gato.alimentarse();
        System.out.println("");
        
        //Objeto caballo
        Animal caballo=new Caballo("Spark","Pasto",25,"Fino");
        caballo.alimentarse();
        
        
        
    }
    
}
