package Reloj;
import static Reloj.Main.leer;
import com.sun.org.apache.bcel.internal.generic.FREM;
/**
 *
 * @author Esteban
 */
public class RelojFit  extends Reloj{
    //Atributos
    private int  frecuenciaAleatoria;
    private int[] coordenadas = new int[2];

    public RelojFit(int frecuenciaAleatoria, String dia, String hora) {
        super(dia, hora);
        this.frecuenciaAleatoria = frecuenciaAleatoria;
    }
    public RelojFit() {
    }
        
   private int frecuencia(){
       frecuenciaAleatoria=(int)(Math.random()*10);
       return frecuenciaAleatoria;
   }
    
   private void cuentaPasos(){
       System.out.println("Ingrese los pasos");
       for (int i = 0; i < coordenadas.length; i++) {
           coordenadas[i]=(int)(Math.random()*10);
           System.out.println(coordenadas[i]);
       }
       System.out.println("");
   }
    
    
    
}
