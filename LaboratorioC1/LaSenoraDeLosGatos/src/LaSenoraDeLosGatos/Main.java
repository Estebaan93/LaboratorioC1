package LaSenoraDeLosGatos;

/**
 *
 * @author Esteban
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lechuza l1=new Lechuza(false, "Roberta", "Hembra");
        Gato g1=new Gato(true, "Kitty", "Hembra");
        Perro p1=new Perro(false, false, "Manchas", "Macho");
        Senora s1=new Senora("La loca de los gatos", 62);
        //Añadimos al arrayList
        s1.adoptarMascota(l1);
        s1.adoptarMascota(g1);
        s1.adoptarMascota(p1);
        System.out.println("Mostrando mascotas de: "+s1.getNombre()+", "+s1.getEdad()+" años");
        s1.mostrarMascotas();
        System.out.println("Vamos a calmar a la lechuza "+l1.getApodo()+" para vacunarla");
        l1.calmarse();
        System.out.println(g1.getApodo()+" ahora no tiene pulgas");
        g1.setTienePulgas(false);
        System.out.println(p1.getApodo()+" tiene garrapatas");
        p1.setGarrapatas(true);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("MOSTRAMOS NUEVAMENTE");
        s1.mostrarMascotas();
    }
    
}
