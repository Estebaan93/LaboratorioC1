/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopeje1;

/**
 *
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
public class OOPeje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1= new Libro();
        libro1.lector();
        System.out.println("");
        libro1.mostrando();
    }
    
}
