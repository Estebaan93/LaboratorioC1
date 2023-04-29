/*Del gato sabemos si tienePulgas o no, además de su apodo y si es macho o hembra. 
Un gato tiene el método yaSeEmpulgo, que ocurre cuando contrae pulgas en la calle.  
Ejemplo, es importante, para un Gato saber si tiene pulgas porque de tenerlas, ya no se puede vacunar*/
package LaSenoraDeLosGatos;

/**
 *
 * @author Esteban
 */
public class Gato extends Mascotas {
    private boolean tienePulgas;

    public Gato(boolean tienePulgas, String apodo, String sexo) {
        super(apodo, sexo);
        this.tienePulgas = tienePulgas;
    }

    public boolean isTienePulgas() {
        return tienePulgas;
    }

    public void setTienePulgas(boolean tienePulgas) {
        this.tienePulgas = tienePulgas;
    }
    
    @Override                   //Sobreescritura del metodo
    public void hacerRuido(){
        System.out.println("Haciendo ruido como gato");
    }
    
    @Override
    public void sePuedeVacunar(){
        if (tienePulgas) {
            System.out.println("No se puede vacunar, "+super.getApodo()+" tiene pulgas");
        }
        else{
            System.out.println(super.getApodo()+", no tiene pulgas, se puede vacunar");
        }
    }

    @Override
    public String toString() {
        hacerRuido();
        sePuedeVacunar();
        return "Gato{" + "tienePulgas=" + tienePulgas + ", sexo= "+super.getSexo()+'}';
    }
    
    
    
    
}
