/* */
package HarryPotter;

/**
 *
 * @author Esteban
 */
public class Wizard {
    String name;
    String hechizo;

    public Wizard(String name, String hechizo) {
        this.name = name;
        this.hechizo = hechizo;
    }
    
    //Metodo nombre
    public void sayName(){
        System.out.println(name);
    }
    
    public Wizard (String name){
        this.name=name;
    }
    //Metodo hechizo
    public void castSpell(){
        System.out.println(hechizo);
    }
}
