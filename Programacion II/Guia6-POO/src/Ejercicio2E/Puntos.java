/*2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto 
puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/
package Ejercicio2E;

/**
 *
 * @author Esteban
 */
public class Puntos {
    //Atributos
    private double x1, y1, x2, y2;
    
    /*Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.*/
    public void crearPuntos(Double x1, Double y1, Double x2, Double y2){
     this.x1=x1;
     this.y1=y1;
     this.x2=x2;
     this.y2=y2;
        
    }
    
    public double calcularDistancia(){
        double r;
        r=Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y1- y2),2));
        return r;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }
    
    
}
