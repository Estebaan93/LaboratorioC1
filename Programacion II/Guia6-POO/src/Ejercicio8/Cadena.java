/*8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicio8;

/**
 *
 * @author Esteban
 */
public class Cadena {
    //Atributos
   private String frase;
   private int longitud;
    
//Constructor vacio
    public Cadena() {
    }
    //Constructor con parametros
    public Cadena(String frase) {
        this.frase = frase;
    }
//Get & Set
    public String getFrase() {
        return frase;
    }
    public void setLongitud(int longitud) {
        this.longitud =this.frase.length();
    }
    public int getLongitud() {
        return longitud;
    }
    
    public void setFrase(String frase) {
        this.frase = frase;
    }
  
//• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(){
        this.frase=this.frase.toLowerCase();                                    //Convertimos a minuscula
        int c=0;
        for (int i = 0; i < this.frase.length(); i++) {
            if (this.frase.charAt(i)=='a'|| this.frase.charAt(i)=='e'|| this.frase.charAt(i)=='i'||this.frase.charAt(i)=='o'||this.frase.charAt(i)=='u') {
                c++; 
            }
        }
        System.out.println("La frase: "+this.frase+" tiene: "+c+" vocales");
    }
    
//• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".    
    public void invertirFrase(){
        String inv= "";
        for (int i = this.frase.length()-1; i >= 0 ; i--) {
            inv+= frase.charAt(i);
        }
        System.out.println("La frase invertida es: "+inv);
    }
//• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.    
   public void vecesRepetido(String letra){
       int c=0;
       for (int i = 0; i <this.frase.length(); i++) {
           if (this.frase.toLowerCase().charAt(i)==letra.toLowerCase().charAt(0)) {         //Compararmos letra por letra segun el largo de la frase
               c++;
           }
       }
       if (c !=0) {
           System.out.println("La letra "+letra+" esta repetida "+c+" veces");
       }else {
           System.out.println("La letra "+letra+ " no se encuentra en la frase");
       }
       
   } 
//• Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.    
   public void compararLongitud(String nuevaFrase){
       if (getLongitud()==nuevaFrase.length()) {                                                               //LLamamos al metodo longitud
           System.out.println("La longitud de las frases son iguales");
       }else {
           System.out.println("La longitud de las frases no son iguales");
       }
   }
//• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
   public void unirFrases(String unir){
       System.out.println(this.frase.concat(", ").concat(unir));
   }
//• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
   public void reemplazar(String reem){
       System.out.println(this.frase.replace("a", reem));
   }
//• Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.   
   public boolean contiene(String cont){
       return this.frase.contains(cont);
   }
   
   
}
