/*Sabemos que el Robot reconoce las órdenes:
• Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos)
• Dormir()
• Despertar()
• Recargar()
• bateriaLLena():boolean
• bateriaVacia() :boolean
• energiaActual() :int
También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada vez que avanza o retrocede por cada 
100 pasos pierde 10 unidades. También sabemos que si damos la orden al robot de dormir, no responderá a ninguna otra
orden hasta despertarlo. Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.*/
package Tp1_Lab1_C1;
import static Tp1_Lab1_C1.TestJuego.leer;

public class Robot {
    //Atributos
    private int cantPasos;
    private Bateria b1;
    private int energia;
    private boolean vacio, lleno;
    private boolean powerOff;
    //Constructor
    public Robot() {
    }
    public Robot(int cantPasos, Bateria b1, int energia, boolean vacio, boolean lleno) {
        this.cantPasos = cantPasos;
        this.b1 = b1;
        this.energia = b1.getEnergia();
        this.vacio = vacio;
        this.lleno = lleno;
    }
    
    //Get&Set
    public Bateria getB1() {
        return b1;
    }
    public int getCantPasos(int cantPasos) {
        return cantPasos;
    }
    public void setCantPasos(int cantPasos) {
    }
    public void setB1(Bateria b1) {
        this.b1 = b1;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
    }
    public boolean isVacio() {
        return vacio;
    }
    public void setVacio(boolean vacio) {
    }
    public boolean isLleno() {
        return lleno;
    }
    public void setLleno(boolean lleno) {
    }
    
    //Metodos
    public void avanzar(int cantPasos) {
        if (batVacio(energia)) {
            energia=(int) (cantPasos*0.1);
        } else{
            System.out.println("No hay energia suficiente");
        }
    }

    public void retroceder(int cantPasos) {
           if (batVacio(energia)) {
            energia=(int) (cantPasos*0.1);
        } else{
               System.out.println("No hay energia suficiente");
           }
    }

    public boolean dormir() {
        //System.out.println("Se puso a dormir el robot");
        powerOff=true;
        return powerOff;
    }
    public boolean despertar() {
       // System.out.println("Despertamos al robot");
        powerOff=false;
        return powerOff;
    }

    public void recargar() {
        System.out.println("Se recargo la bateria al 100%");
        energia=1000;
        System.out.println(energia);
    }

    public boolean batLlena(int energia) {
        if (energia==1000) {
            System.out.println("La bateria esta llena");
            System.out.println(energia);
        }
        return true;
    }
    public boolean batVacio(int energia) {
          if (energia<0.1) {
              System.out.println("La bateria se encuentra sin carga");
              System.out.println(energia);
        }
        return true;
    }

    public void energiaActual() {
        System.out.println(energia);
    }
}
