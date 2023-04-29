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

/**
 *
 * @author Esteban
 */
public class Cafetera {
    //Atributos 
    private int  capacidadMaxima, cantidadActual;

    //Constructor vacio o por defecto
    public Cafetera() {
    }

    //Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //Get && Set
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual=cantidadActual;
    }
    
    //Metodo llenar cafetera
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    //Metodo servir taza
    public int servirTaza(int taza){
        if (this.cantidadActual< taza) {
            System.out.printf("La taza de %d cc se lleno con %d cc \n",taza, this.cantidadActual);
            this.cantidadActual=0;
        }else {
            System.out.println("La taza se lleno por completo");
            System.out.println("");
            this.cantidadActual-=taza;
        }
        return this.cantidadActual;
    }
    
    //Metodo vaciar cafetera
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    //Metodo agregar cafe
    public int agregarCafe(int agregar){
        if (this.cantidadActual+agregar>this.capacidadMaxima) {
            System.out.println("La cafetera se lleno y te sobro "+Math.abs(this.capacidadMaxima-(cantidadActual+agregar))+" ml");
            cantidadActual=this.capacidadMaxima;
        }else {
            cantidadActual+=agregar;
            System.out.println("La cafetera cotiene "+cantidadActual+ "ml");
        }
        return this.cantidadActual;
    }
    
    public void mostarCafe(){
        int can= this.cantidadActual;
        System.out.println("La cafetera tiene "+can+" cc de cafe");
    }
    
}
