/* Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) 
y mojado (indica si está mojado o no el jugador). 
El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos: 
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false.
 */
package Ejercicio2;

/**
 *
 * @author Esteban
 */
public class Jugador  {
    //Atributos
   private int id;
    private String nombre;
    private boolean mojado;
    
    //Constructores
    public Jugador(int id) {
        this.id = id;
        this.nombre ="Jugador "+id ;        //Ya le asignamos el nombre mas su id
        this.mojado=true;                          //Vivos
    }
   

    //Metodos
    //• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
//aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método devuelve true, sino false
    public void disparo(RevolverDeAgua r) {
        System.out.println("El "+nombre+" se apunta con la pistola");
        //El jugador se apunta con el revolver..
        if (r.mojar()) {
            this.mojado=false;          //El juegador muere
            System.out.println("El "+nombre+" ha muerto...");
        }else{
            System.out.println("El "+nombre+" ha zafado...");   //No muere
        }  
        
    }   
    public boolean isMojado() {
        return mojado;
    }
    
   }

    
            

