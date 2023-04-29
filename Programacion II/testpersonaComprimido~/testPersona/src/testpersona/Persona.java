
package testpersona;

import java.time.LocalDate;

/**
 *
 * @author SE31452
 */
public abstract class Persona {
    
        private String nombre;
        private int dni;
        private LocalDate fechaDeNac;
        private String domicilio;

    public Persona(String nombre, int dni, LocalDate fechaDeNac, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNac = fechaDeNac;
        this.domicilio = domicilio;
    }

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

    public LocalDate getFechaDeNac() {
        return fechaDeNac;
    }

    public void setFechaDeNac(LocalDate fechaDeNac) {
        this.fechaDeNac = fechaDeNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int calcularEdad(){
        int edad=0;
        
        
        return edad;
    }
    
    public int calcularDiasVividos(){
        int dias=0;
        
        return dias;
    }
    
    public abstract void cobrar();
    
}
