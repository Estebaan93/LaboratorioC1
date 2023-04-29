package Reloj;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Esteban
 */
public class Reloj {
    //Atributos
    protected String dia,hora,modelo;
    protected long numSerie;
    protected boolean limpiarFecha=true;
    
    //Constructor

    public Reloj(String dia, String hora) {
        this.dia=dia;
        this.hora=hora;
    }

    public Reloj() {
        dia=LocalDate.now().toString();
        hora=LocalTime.now().toString();
    }
    
    //Get
    public String getDia() {
        return dia;
    }
    public String getHora() {
        return hora;
    }
    
    //Metodos
    public String incrementarDia(){
        LocalDate d=LocalDate.parse(dia);
        if (limpiarFecha) {
       // System.out.println("1 dia hacia adelante sera: "+ d.plusDays(1));     
       dia=d.plusDays(1).toString();
        }  
        return dia;
        
    }
    public String incrementarHora(){
       LocalTime h=LocalTime.parse(hora);
        if (limpiarFecha) {
            //System.out.println("1 hora hacia adelante sera: "+h.plusHours(1));
            hora=h.plusHours(1).toString();
        }
        return hora;
    }
      
    @Override
    public String toString() {
        String date;
        if (limpiarFecha) {
            date="Reloj{" + "dia=" + dia + ", 1 dia hacia adelante: "+incrementarDia() +", hora=" + hora  +", 1 hora hacia adelante: "+incrementarHora()+ '}';
        } else{
            date="Reloj{" + "dia=" + dia +", hora=" + hora  +'}';
        }
        return date;
    }
        
    public void limpiar(){
        System.out.println("Limpiamos la fecha y hora:");
        dia="1111-11-11";
        hora="00:00:00.000";
        limpiarFecha=false;
                
    }
    
    
}
