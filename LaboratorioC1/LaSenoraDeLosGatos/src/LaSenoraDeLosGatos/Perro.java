/*En cambio para un perro(si la señora adopta más que gatos…o todo lo que ve), solo se puede vacunar si no está
enfermoMoquillo(atributo), y no tieneGarrapatas(getter). (Ademas de métodocontrajoGarrapatas (setter a true). Atributos de perro: garrapatas y 
enfermoMoquillo (ambos boolean). */
package LaSenoraDeLosGatos;

/**
 *
 * @author Esteban
 */
public class Perro extends Mascotas {
    private boolean enfermoMoquillos, garrapatas;

    public Perro(boolean enfermoMoquillos, boolean garrapatas, String apodo, String sexo) {
        super(apodo, sexo);
        this.enfermoMoquillos = enfermoMoquillos;
        this.garrapatas = garrapatas;
    }

    public boolean isEnfermoMoquillos() {
        return enfermoMoquillos;
    }

    public void setEnfermoMoquillos(boolean enfermoMoquillos) {
        this.enfermoMoquillos = enfermoMoquillos;
    }

    public boolean isGarrapatas() {
        return garrapatas;
    }

    public void setGarrapatas(boolean garrapatas) {
        this.garrapatas = garrapatas;
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Ladrando como perro");
    }
    
    @Override
    public void sePuedeVacunar(){
        if (enfermoMoquillos || garrapatas) {
            System.out.println(super.getApodo()+", No se puede vacunar");
        } else{
            System.out.println(super.getApodo()+", se puede vacunar");
        }
    }

    @Override
    public String toString() {
        hacerRuido();
        sePuedeVacunar();
        return "Perro{" + "enfermoMoquillos=" + enfermoMoquillos + ", garrapatas=" + garrapatas +", sexo= "+super.getSexo()+ '}';
    }
    
    
}
