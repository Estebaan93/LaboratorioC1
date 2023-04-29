/*14. Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Guia1_Ej_6A19;

import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el Scanner leer
        Scanner leer=new Scanner(System.in);
        int num1, num2, opc, sum, res, mul;                                                              //Variables de tipo entero
        float div;                                                                                                          //Variables de tipo real
        boolean finalizar;
        char salir='n';                                                                                                 //Me guarda solo un caracter
        
        System.out.println("Ingrese dos numero enteros positivos:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        //Bucle while que me dice que ingrese solo nros positivos
        while (num1<=-1 ||  num2<=-1) {                                                     //Condicional nros positivos
            System.out.println("Ingrese solo numeros positivos");
            num1=leer.nextInt();
            num2=leer.nextInt();
        }
        while (salir=='n' || salir=='N'){
        System.out.println("***********");
        System.out.println("* M E N U *");
        System.out.println("***********");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
             opc=leer.nextInt();
        switch (opc){
            case 1:
                sum=num1+num2;
                System.out.println("La suma es "+sum);
                break;
            case 2:
                res=num1-num2;
                System.out.println("La reste es "+res);
                break;
            case 3:
                mul=num1*num2;
                        System.out.println("La multiplicacion es "+mul);
                        break;
            case 4:
                div=(float) num1/ (float)num2;
                System.out.println("La division es "+div);
                break;
            case 5:
                System.out.println("¿Estas seguro que desea salir del programa (S/N)?");
                salir=leer.next().charAt(0);                                                                                    //Toma solo la primer letra
                if (salir=='n'&& salir=='N'){
                 finalizar=true;
                }
                break;
                
            default:
                System.out.println("Opcion invalida");
            }  
        } 
    }
}