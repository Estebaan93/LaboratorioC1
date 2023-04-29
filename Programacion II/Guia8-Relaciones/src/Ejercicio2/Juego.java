/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos: 
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se 
termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que
jugador se mojó.
 */
package Ejercicio2;

/**
 *
 * @author Esteban
 */
public class Juego {

    //Atributos
    private Jugador[] jugadores;
    private RevolverDeAgua revolver;

    //Constructor
    public Juego(int numJugadores) {
        jugadores = new Jugador[comprobarJugadores(numJugadores)];
        crearJugadores();
        revolver = new RevolverDeAgua();
    }
   
    //Comprueba que el numero de jugadores esta en el rango correcto
    private int comprobarJugadores(int numJugadores) {
        //Sino esta en el rango correcto se pone a 6
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }
    //Crea los jugadores
    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }

    //indica si el juego acaba o no
    public boolean finJuego() {
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isMojado()) {
                //Acabo el juego
                return true;
            }
        }
        return false; //No termina el juego
    }
 /*• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se 
termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que
jugador se mojó.*/
    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
        System.out.println("Posicion Actual "+revolver.getPosicionActual());
        System.out.println("Posicion de Agua "+revolver.getPosicionAgua());
            jugadores[i].disparo(revolver);
            //Si muere, terminamos
            if(!jugadores[i].isMojado()){
                return;
            }
            
        }
        
       }

    }
 
