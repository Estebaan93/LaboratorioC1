package Celular;

public class Persona {
    //Atributos
    private String nombre;
    private int dni;

   //Constructor

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Get & Set

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    //Metodo usar celular 
    public void usarCelular(Celular celu){
        System.out.println("Se esta por utilizar el celular de modelo "+ celu.getModelo());
        if (celu.getNroChip()>0) {              //Preguntamos si tiene chip el celular, entonces podemos realizar una llamada
            int num=celu.getNroChip();           //Guardamos el numero de chip en una variable
            if (num==2) {
                num--; 
            System.out.println("Se realiza una llamada desde el numero "+ celu.getChips()[num].getNumero());    //Obtenemos el numero del chip
            //Decrementamos el valor de num, porque de otra forma caemos afuera del arreglo de 2 posiciones
            } else {
                System.out.println("No se puede realizar la llamada");
            }
        }
        
    }
    
    //toString 
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
