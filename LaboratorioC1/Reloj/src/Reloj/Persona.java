/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;
import static Reloj.Main.leer;

/**
 *
 * @author Esteban
 */
public class Persona {
    //Atributos
    private Reloj reloj=new Reloj();
    private int edad;
    private String nombre;
    
    //Constructor
    public Persona() {        
       }
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    //Get&Set
    public Reloj getReloj(){   
        return reloj;
    }
    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {    
        this.nombre = nombre;
    }

    //Metodos
    private void nombre() {
        System.out.println("Ingrese el nombre");
        this.nombre=leer.next();
    }
    private void edad(){
        System.out.println("Ingrese la edad");
        this.edad=leer.nextInt();
    }
    private void decirHora(Reloj reloj){
        reloj.getHora();
    }
    public void llamar(){
    nombre();
    edad();
    decirHora(reloj);
    System.out.println(reloj.toString());
    reloj.limpiar();
     System.out.println(reloj.toString());
    System.out.println(toString());
    System.out.println(reloj.getHora());
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }

    
    
    
    
    
    
    
}
