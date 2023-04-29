/*La clase Hombre solamente dar implementación al método JugarConRobot() para que: El robot Avance 500 pasos. 
El robot Retroceda 20 pasos. Informe por pantalla cuanta energía tiene el robot Actualmente. Ponga el robot a dormir.*/
package Tp1_Lab1_C1;

public class Hombre {
    //Atributos
    private Robot r1;
    
    //Constructor
    public Hombre() {
    }
    //Metodo
     public void jugarConRobot(Robot r1) {
         r1.avanzar(500);
    }
     //Get&Set
    public Robot getR1() {
        return r1;
    }    
    public void setR1(Robot r1) {
    }

   
}
