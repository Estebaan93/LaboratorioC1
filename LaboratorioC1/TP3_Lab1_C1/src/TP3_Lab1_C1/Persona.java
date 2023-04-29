package TP3_Lab1_C1;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {

    protected String nombre;

    protected int dni;

    protected LocalDate nacimiento;

    protected String domicilio;

    public Persona(String nombre, int dni, LocalDate nacimiento, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.nacimiento = nacimiento;
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

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    
    public Persona() {
        
    }

    public void calcularEdad() {
        LocalDate ahora= LocalDate.now();
        Period periodo= Period.between(nacimiento, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }

    public int diasVividos() {
        
        return 0;
        
    }

    public void cobrar() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", nacimiento=" + nacimiento + ", domicilio=" + domicilio + '}';
    }
    
    
}
