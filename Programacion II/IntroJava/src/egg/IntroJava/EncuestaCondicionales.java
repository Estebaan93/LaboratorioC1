/*
 Clasificacion de una peli del 1 al 5. Estructuras Condicionales 
 */
package egg.IntroJava;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;                                                                    //Creamos una variable de tipo entero
        Scanner leer = new Scanner (System.in);                 //Creamos un Scanner para la leer lo que el usuario ingresa por teclado
        System.out.println("Clasifique la peli del 1 al 5");
        opinion=leer.nextInt();                                             //Guardamos en valor en la variable opinion
        
        if  (opinion >=1 && opinion<= 5){                      //Condicion logica si esta entre 1 y 5
            
            switch   (opinion) {
                case 1:
                    System.out.println("Tal mala fue la peli...?");
                    break;                  //Se utiliza para detener la ejecucion aqui, si es esta la opcion elegida.
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli... ");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has clasificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que hayas disfrutado un excelente entretenimiento!!! ");
                    break;
                    //El equivalente al caso "De otro Modo" es el "default"
                    //default:
                    // <acciones>
        }
        } else if (opinion<0){              //Si la condicion es menor a 0
            System.out.println("Una oponion negativa? Tal malaaa fue la peli?");
    } else if (opinion == 0) {              //Si es igual a 0
            System.out.println("El valor "+ opinion + " no es valido y no se tomara en cuenta");
    } else {                            //Si no es ninguna de las anteriores, quiere decir que es mayor a 5
            System.out.println(opinion+" !Wow! se te fue la mano con la calificacion!! :D");
    }
        System.out.println("Hasta la proxima");
    }
    
}
