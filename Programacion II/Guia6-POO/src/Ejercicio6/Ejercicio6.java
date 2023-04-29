/*6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y 
cantidadActual la cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Ejercicio6;
import java.util.Scanner;
/**
 *
 * @author Esteban
 */
public class Ejercicio6 {
public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion de objeto
        Cafetera caf1=new Cafetera(1500,0);
        
        boolean salir=true;
        int agregar, op, opTaza;
        
        while(salir){
            System.out.println("*********MENU CAFETERA********");
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir taza");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar cafe");
            System.out.println("5-Mostar cafe");
            System.out.println("6-Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion");
            op=leer.nextInt();
            
            switch(op) {
                case 1:
                    caf1.llenarCafetera();
                    System.out.println("Se ha llenado la cafetera");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Menu taza");
                    System.out.println("1- 100 cc");
                    System.out.println("2- 200 cc");
                    System.out.println("3- 300 cc");
                    System.out.println("Elegir tamaño de la taza");
                    opTaza=leer.nextInt();
                    switch(opTaza){
                        case 1:
                            caf1.servirTaza(100);
                            break;
                        case 2:
                            caf1.servirTaza(200);
                            break;
                        case 3:
                            caf1.servirTaza(300);
                            break;
                        default :
                            System.out.println("No existe la opcion elegida");
                    }
                    break;
                    
                case 3:
                    caf1.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe en cc a agregar");
                    agregar=leer.nextInt();
                    caf1.agregarCafe(agregar);
                    break;
                case 5:
                    caf1.mostarCafe();
                    break;
                case 6:
                    salir=false;
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        
    }
    
}
