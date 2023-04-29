/* Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición del tambor que se dispara, puede que esté el agua o no) y 
posición agua (la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual 
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)  */
package Ejercicio2;

/**
 *
 * @author Esteban
 */
public class RevolverDeAgua {
    //Atributos
   private int posicionActual, posicionAgua;
    
    //Constructor ya lleno con los numeros aleatorios
    public RevolverDeAgua() {
      posicionActual= (int) Math.floor(Math.random() * (6 - 1 + 1) + (1));
      posicionAgua= (int) Math.floor(Math.random() * (6 - 1 + 1) + (1));
    }
    
    //Get & Set
    public int getPosicionActual() {
        return posicionActual;
    }
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    public int getPosicionAgua() {
        return posicionAgua;
    }
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
  
  //• mojar(): devuelve true si la posición del agua coincide con la posición actual 
  public boolean mojar(){
      boolean disparo=false;
      if (posicionActual==posicionAgua) {
          disparo=true;
      }
      siguienteChorro();
        return disparo;
  }
  
  //• siguienteChorro(): cambia a la siguiente posición del tambor
  public void siguienteChorro(){
      if (posicionActual==6) {          //Si es igual a 6, se mueve a 1 EL TAMBOR TIENE 6 POSICIONES
          posicionActual=1;
      } else{
          posicionActual++;             //Se mueve a la siguiente posicion
      }
      
  }
  
  //• toString(): muestra información del revolver (posición actual y donde está el agua)
    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
 
}
