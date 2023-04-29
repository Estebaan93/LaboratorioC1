/*2. Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.

• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.

• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.

• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios: */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Electrodomestico {
 public static Scanner leer=new Scanner(System.in).useDelimiter("\n");                      //Tambien heredamos el scanner :)
    //Valores por defecto
    public final static String COLOR_DEFECTO="blanco";
    public final static char CONSUMO_ENERG='F';
    
    //Atributos 
    protected double precio=1000;
    protected double peso;
    protected String color;
    protected char consumoEner;
    
    //Constructores
    public Electrodomestico() {
    }
    public Electrodomestico(double precio, double peso, String color, char consumoEner) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEner = consumoEner;
    }
    
    
    //Get & Set
    public double getPrecio() {
        return precio;
    }
    public double getPeso() {
        return peso;
    }
    public String getColor() {
        return color;
    }
    
    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F por defecto
     * Este método se debe invocar al crear el objeto y no será visible.
     * @param consumoEner 
     */
     private void comprobarConsumoEnergetico(char letra){
         if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {          //Basado en la tabla ascii
             this.consumoEner=letra;                              //Si esta entre esos valores se asigna
         }else{
             this.consumoEner= CONSUMO_ENERG;                   //Caso contrario se asigna por defecto
         }
     }

     /**
      * Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto
      * Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris
      * No importa si el nombre está en mayúsculas o en minúsculas
      * Este método se invocará al crear el objeto y no será visible.
      * @param color 
      */
 private void comprobarColor(String color){
     String colores[]={"blanco", "negro", "rojo", "azul", "gris" };             //Colores disponibles
     boolean encontrado=false;  //Buscamos el color dentro del array
     for (int i = 0; i < colores.length && !encontrado /*false, se tiene que cumplir que sea diferente de encontrado*/ ; i++) {
         if (colores[i].equals(color)) {
             encontrado=true;
             System.out.println("Color disponible");
            }   
         }
     if (encontrado) {
         this.color=color;                              //Le asignamos un valor de colores disponibles
     } else{
         this.color=COLOR_DEFECTO;      //Si el usuario elige un color que no esta disponible, le asignamos el de por defecto
         System.out.println("Color por defecto "+COLOR_DEFECTO);
     }
     System.out.println("");
 }
    
 /**
  * Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar el color y el
consumo
  * Al precio se le da un valor base de $1000
     * 
     * 
     * 
  */
 public void crearElectrodomentico() {
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso=leer.nextDouble();
        System.out.println("Ingrese el color");
        this.color=leer.next().toLowerCase();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energetico");
        this.consumoEner=leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(consumoEner);
     }
 
 
 /**
  * Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. 
  * @return 
  */
 public double precioFinal(){
     double plus=0;                     //Me va guardar el valor de consumo energetico segun la letra
     switch (consumoEner) {
         case 'A' :
             plus+=1000;
             break;
         case 'B':
             plus+=800;
             break;
         case 'C':
             plus+=600;
             break;
         case 'D':
             plus+=500;
             break;
         case 'E':
             plus+=300;
             break;
         case 'F':
             plus+=100;
             break;
          }
     if (peso>=1 && peso<=19) {                     //Segun el peso le aumentamos el precio
         plus +=100;
     }if (peso>=20 && peso<=49) {
         plus+=500;
     } if (peso>=50 && peso<=79) {
         plus+=800;
     } else if (peso>=80) {
         plus+=1000;
     }
     return precio+plus;                                //Precio mas plus por peso y consumo energetico
 }
 
 
}
