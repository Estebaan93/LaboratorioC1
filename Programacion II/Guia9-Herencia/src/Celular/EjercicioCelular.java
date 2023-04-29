/* Herencia de un celular, con sus partes y una persona que lo usa */
package Celular;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class EjercicioCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Collections
        ArrayList <Celular> celulares= new ArrayList();
        
        //Creacion del objeto chip, solo me deberia de tomar 2 chip, ya que el celular tiene 2 ranuras (Vector [2])
        Chip claro = new Chip("Claro", 266542122);
        Chip personal = new Chip("Personal", 266400132);
        Chip movistar = new Chip("Movistar", 266512345);

        //Creacmos el celular
        Celular cel1 = new Celular("Motorola g9", "motorola", 3600);
        Celular cel2 = new Celular("Nokia 6", "nokia", 3000);
        Celular cel3 = new Celular("Samsung a70", "samsung", 4000);

        //Agregamos los chips al cel 1
        cel1.agregarChip(claro);
        cel1.agregarChip(movistar);
        
        //Agregamos una persona
        Persona per=new Persona("Rosa", 3900223);
        per.usarCelular(cel1);
        System.out.println("");
        celulares.add(cel1);
        celulares.add(cel3);
        celulares.add(cel2);
        //Mostramos con for ech
        for (Celular aux : celulares) {
            System.out.println(aux);
            aux.mostrarChip();
        }
        
    }

}
