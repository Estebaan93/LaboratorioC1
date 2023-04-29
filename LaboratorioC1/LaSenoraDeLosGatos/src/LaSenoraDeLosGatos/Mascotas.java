/*De las mascotas tenemos, su apodo y sexo. Y todas contienen los comportamientos
abstractos hacerRuido, y se debe saber si sePuedeVacunar (devuelve void), pero eso 
dependerá de cada especie… */
package LaSenoraDeLosGatos;

/**
 *
 * @author Esteban
 */
public abstract class Mascotas {
    private String apodo, sexo;

    public Mascotas(String apodo, String sexo) {
        this.apodo = apodo;
        this.sexo = sexo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public abstract void hacerRuido();          //Genericos
    public abstract void sePuedeVacunar();

    @Override
    public String toString() {
        return "Mascotas{" + "apodo=" + apodo + ", sexo=" + sexo + '}';
    }
    
    
}
