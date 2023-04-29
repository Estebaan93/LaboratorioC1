/* Todas sus mascotillas deben implementar los métodos hacerRuido de acuerdo a su especie mostrar si maulla, ladra, o ulula;
y sePuedeVacunar() polimórficamente, ya que la lechuza no se deja vacunar si esta enojada. 
Usar super en al construir mascotas particulares. Desde la java main class, crear mascotas diferentes, y guardarlas en la lista de mascotas de la señora. 
Luego mostrar para cada una su nombre y si se puede vacunar. Enfermar, empulgar, y enojar mascotas, para que dejen de ser vacunables. */
package LaSenoraDeLosGatos;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
public class Senora {
    private String nombre;
    private int edad;
    private ArrayList<Mascotas> mascotas;

    public Senora(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascotas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void adoptarMascota(Mascotas m){
        mascotas.add(m);
    }
    public void mostrarMascotas(){
        for (Mascotas aux : mascotas) {
            System.out.println(aux);
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Senora{" + "nombre=" + nombre + ", edad=" + edad + ", mascotas=" + mascotas + '}';
    }
    
    
    
}
