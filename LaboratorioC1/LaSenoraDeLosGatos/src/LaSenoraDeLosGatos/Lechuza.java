/*Recientemente adopto una Lechuza (si, lo que encuentre…) con atributos: calmada o no, y además tiene la característica de establecer su ululato
(por defecto “graznar”, si enojada “chuzear”). Es muy temperamental, y tiene los métodos enojarse() y calmarse() que modifican 
ambas características del avechucho. Además, puede ulular (devuelto string ululato). */
package LaSenoraDeLosGatos;

/**
 *
 * @author Esteban
 */
public class Lechuza extends Mascotas{
    private boolean calmada;
    private String ululato="Granzar";          //Por defecto granzar

    public Lechuza(boolean calmada, String apodo, String sexo) {
        super(apodo, sexo);
        this.calmada = calmada;
    }

    public boolean isCalmada() {
        return calmada;
    }

    public void setCalmada(boolean calmada) {
        this.calmada = calmada;
    }

    public String getUlulato() {
        return ululato;
    }

    public void setUlulato(String ululato) {
        this.ululato = ululato;
    }

    
    
    public void enojarse(){
       calmada=false;
      this. ululato="Chuzear";
    }
    
    public void calmarse(){
        calmada=true;
        this.ululato="Granzar";
    }
    
    @Override
    public void hacerRuido(){
        if (calmada) {
            System.out.println("La lechuza esta calmada, "+ululato);
        } else{
            enojarse();
            System.out.println("La lechuza esta enojada, "+ululato);
        }
    }
    
    @Override
    public void sePuedeVacunar(){
        if (calmada) {
            System.out.println("La lechuza, "+super.getApodo()+" se puede vacunar");
        } else{
            System.out.println("La lechuza, "+super.getApodo()+" no se puede vacunar, esta enojada");
        }
    }

    @Override
    public String toString() {
        hacerRuido();
        sePuedeVacunar();
        return "Lechuza{" + "calmada=" + calmada + ", ululato=" + getUlulato() +", sexo= "+super.getSexo()+'}';
    }

    
    
}
