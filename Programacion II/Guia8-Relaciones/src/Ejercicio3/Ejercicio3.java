/*3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos)
y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al 
usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número  de cartas. En caso de que haya menos
cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara
esa primera carta. */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio3 {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        boolean finalizar;
        char salir='n';    
        Baraja b=new Baraja();
          while (salir=='n' || salir=='N'){     
              System.out.println("");
           System.out.println("INGRESE UNA OPCION");
           System.out.println("1. BARAJAR.");
           System.out.println("2. SIGUIENTE CARTA.");
           System.out.println("3. CARTAS DISPONIBLES.");
           System.out.println("4. DAR CARTAS.");
           System.out.println("5. MOSTRAR CARTAS QUE SALIERON.");
           System.out.println("6. MOSTRAR MAZO.");
           System.out.println("7. SALIR.");
              System.out.println("");
           int opc=leer.nextInt();
           System.out.println("");
           switch (opc) {
            case 1:
                System.out.println("BARANJANDO...");
                b.barajar();
                break;
            case 2:
                System.out.println("MOSTRANDO SIGUIENTE CARTA:");
                System.out.println(b.siguienteCarta());
               break;
            case 3:
                System.out.println("MOSTRANDO LAS CARTAS DISPONIBLES:");
                System.out.println(b.cartasDisponibles());
                break;
            case 4:
                System.out.println("CUANTAS CARTAS DESEA DAR?");
                int dar=leer.nextInt();
                b.darCartas(dar);
                break;
            case 5:
                System.out.println("MOSTRANDO CARTAS QUE SALIERON");
                b.cartasMonton();
               break;
            case 6:
                System.out.println("MOSTRANDO MAZO");
                b.mostrarBaraja();
             break;
            case 7:
                System.out.println("¿Estas seguro que desea salir del programa (S/N)?");
                salir=leer.next().charAt(0);                                                                                    //Toma solo la primer letra
                if (salir=='n'&& salir=='N'){
                 finalizar=true;
                }
                break;
            default:
                System.out.println("OPCION INCORRECTA");
        }
                 
        }
    }
    
}
