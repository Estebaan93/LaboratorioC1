/*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package Ejercicio1;

/**
 *
 * @author Esteban
 */
public class Libro {

    //Declaracion de variables
    private int isbn, numeroPag;
    private String titulo, autor;

    //Constructor vacio
    public Libro() {

    }

    //lConstructor con parametros
    public Libro(int isbn, String titulo, String autor, int numeroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }

    //Metodo largar libro
    public void lector(int isbn, String titulo, String autor, int numeroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }

    //Get & Set
    public int getISBN() {
        return isbn;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo imprimir
    public void imprimir() {
        System.out.println("El ISBN del libro es: " + isbn);
        System.out.println("El titulo del libreo es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El libro tiene: " + numeroPag + " paginas");
    }
}
