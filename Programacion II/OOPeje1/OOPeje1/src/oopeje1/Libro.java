/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopeje1;

import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

        public void lector(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese los datos del libro...: ");
            System.out.println("Ingrese el ISBN: ");
        ISBN=leer.nextInt();
            System.out.println("Ingrese el Titulo del libro: ");
        titulo=leer.next();
            System.out.println("Ingrese el autor del numero: ");
        autor=leer.next();
            System.out.println("Ingrese el numero de paginas del libro: ");
        numeroPaginas=leer.nextInt();
}
    public Libro() {           //siempre hay q crear un constructor vacio dentro de la clase
    }

    public Libro(int ISBN, String titulo, String autor, int NumeroPaginas) {   //luego se crea un constructor con todos los parametros.
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = NumeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.numeroPaginas = NumeroPaginas;
    }
    
            public void mostrando(){
            System.out.println("El ISBN del libro es :"+ ISBN);
        }
}
