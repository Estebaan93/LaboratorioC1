
package egg.Guia_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.Random;

public class Guia_1 {

    /**
     * @param args the command line arguments
     */   
    
    public static void main(String[] args)
    {
        // System.out.println("Soy main... chau!");
        ejercicio_18();
        
    } // End of Main
    
    
   static void ejercicio_1(){
   /*
     Escribir un programa que pida dos números enteros por teclado y calcule la
     suma de los dos. El programa deberá después mostrar el resultado de la suma
   */
   
   int num_a = 0;
   int num_b = 0;
   
   Scanner leer = new Scanner(System.in);
   System.out.println(" Este programa pide dos números enteros por teclado, calcula la suma de ambos y la muestra por pantalla.");
   System.out.print("\n Por favor, ingrese el primer entero: ");
   while (num_a <= 0) {num_a = leer.nextInt();}
   System.out.print("\n Por favor, ingrese el segundo entero: ");
   while (num_b <= 0) {num_b = leer.nextInt();}
   
   System.out.println("\n La suma de " + num_a + " y " + num_b + " es: " + (num_a + num_b) + ". \n");
        
   } // Fin Ejercicio 1
    
   static void ejercicio_2(){
   /*
     Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
   */
   
   String nombre = "";
   Scanner leer = new Scanner(System.in);
   
   System.out.println(" Este programa nos pide nuestro nombre, lo almacena en una variable y finalmente la muestra por pantalla.");
   System.out.print("\n Por favor, ingrese su nombre: ");
   while (nombre.equals("")) {nombre = leer.nextLine();}
   
   System.out.print("\n El nombre ingresado fue: " + nombre + ". \n");
        
   } // Fin Ejercicio 2
   
   static void ejercicio_3(){
   /*
     Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
     Nota: investigar la función toUpperCase() y toLowerCase() en Java.
   */
   
   String frase = "";
   Scanner leer = new Scanner(System.in);
   
   System.out.print(" Este programa nos pide que ingresemos una frase, luego la convierte a mayúsculas y la muestra por pantalla");
   System.out.print(" para a continuación convertirla a minúsculas y mostrar su contenido actualizado.");
   System.out.print("\n\n Por favor, ingrese la frase: ");
   while (frase.equals("")) {frase = leer.nextLine();}
   
   System.out.print("\n La frase ingresada fue: " + frase + ".");
   frase = frase.toUpperCase();
   System.out.print("\n LA FRASE EN MAYÚSCULAS ES: " + frase + ".");
   frase = frase.toLowerCase();
   System.out.print("\n y en minúsculas es: " + frase + ".\n");
        
   } // Fin Ejercicio 3
   
   static void ejercicio_4(){
   /*
     4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5).
   */
   
   Scanner leer = new Scanner(System.in);
   double temp_in_celsius = 0.0;
   
   System.out.print(" Este programa nos pide que ingresemos una T° en C° y muestra su equivalente en F°.\n");
   System.out.print("\n Por favor, ingrese la temperatura a convertir: ");
   temp_in_celsius = leer.nextDouble();
   
   double temp_in_fahrenheit = 32 + (9 * temp_in_celsius / 5);
   System.out.print("\n La T° ingresada (" + temp_in_celsius + " °C) equivale a " + temp_in_fahrenheit + "°F.\n");
        
   } // Fin Ejercicio 4
        
   static void ejercicio_5(){
   /*
     5. Escribir un programa que lea un número entero por teclado y muestre por pantalla
        el doble, el triple y la raíz cuadrada de ese número.
     Nota: investigar la función Math.sqrt()
   */
   
   Scanner leer = new Scanner(System.in);
   int num = 0;
   
   System.out.print(" Este programa nos pide que ingresemos un número entero y nos muestra su doble, triple y raíz cuadrada.\n");
   System.out.print("\n Por favor, ingrese el número a evaluar: ");
   while(num == 0) {num = leer.nextInt();}
           
   System.out.print("\n El número ingresado fue: " + num + ".");
   System.out.print("\n Su doble es: " + (num * 2) + ".");
   System.out.print("\n Su triple es: " + (num * 3) + ".");
   System.out.print("\n Su raíz cuadrada es: " + sqrt(num) + ".\n");
   
   } // Fin Ejercicio 5 
   
   static void ejercicio_6(){
   /*
     6. Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla.
   */
   
   Scanner leer = new Scanner(System.in);
   int num_a = 0;
   int num_b = 0;
   
   System.out.print(" Este programa nos pide que ingresemos dos números enteros y nos indica cuál de ellos es el de mayor valor.\n");
   System.out.print("\n Por favor, ingrese el primer número a evaluar: ");
   num_a = leer.nextInt();
   System.out.print(" Por favor, ingrese el segundo número a evaluar: ");
   num_b = leer.nextInt();
   System.out.print("\n Los números ingresados fueron: " + num_a + " y " + num_b + ". ");
   
   if (num_a == num_b) { System.out.print("Ambos tienen el mismo valor. \n"); }
   else {
         if (num_a > num_b){ System.out.print(num_a + " es el mayor valor."); }
         else { System.out.print(num_b + " es el mayor valor."); }
        }
   
   } // Fin Ejercicio 6
   
   static void ejercicio_7(){
   /*
     7. Crear un programa que dado un numero determine si es par o impar.
   */
   
   Scanner leer = new Scanner(System.in);
   int num = 0;
   
   System.out.print(" Este programa nos pide que ingresemos un número entero y determina si se trata de un número par o impar.\n");
   System.out.print("\n Por favor, ingrese el primer número a evaluar: ");
   while(num == 0) { num = leer.nextInt(); }
   
   System.out.print("\n El número ingresado fue: " + num + " y es ");
   
   if (num % 2 == 0) { System.out.print("par.\n"); } else { System.out.print("impar.\n"); }
   
   } // Fin Ejercicio 7
   
   static void ejercicio_8(){
   /*
     8. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
        sino mostrará un mensaje de Incorrecto.
     Nota: investigar la función equals() en Java.
   */
  
   String MENSAJE_CORRECTO = "Correcto";
   String MENSAJE_INCORRECTO = "Incorrecto";
   
   String frase = "";
   Scanner leer = new Scanner(System.in);
   
   System.out.print(" Este programa nos pide que ingresemos una frase.\n");
   System.out.print(" Si ingresamos 'eureka' nos mostrará un mensaje de confirmación.");
   System.out.print(" Caso contrario nos mostrará un mensaje de error. \n");
   
   System.out.print("\n Por favor, ingrese la clave: ");
   while (frase.equals("")) {frase = leer.nextLine();}
   
   if (frase.equals("eureka")) { System.out.println(MENSAJE_CORRECTO); } else { System.out.println(MENSAJE_INCORRECTO); }
        
   } // Fin Ejercicio 8
   
   static void ejercicio_9(){
   /*
     9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
        Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
        por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
       
       Nota: investigar la función Lenght() en Java.
   */
  
   String MENSAJE_CORRECTO = "CORRECTO";
   String MENSAJE_INCORRECTO = "INCORRECTO";
   
   String frase = "";
   Scanner leer = new Scanner(System.in);
   
   System.out.print(" Este programa nos pide que ingresemos una frase de ocho (8) caracteres de longitud.\n");
   System.out.print(" Si ingresamos una frase válida, nos mostrará un mensaje de confirmación.");
   System.out.print(" Caso contrario nos mostrará un mensaje de error. \n");
   
   System.out.print("\n Por favor, ingrese la frase a evaluar: ");
   while (frase.equals("")) {frase = leer.nextLine();}
   
   if ( frase.length() == 8 ) { System.out.println(MENSAJE_CORRECTO); } else { System.out.println(MENSAJE_INCORRECTO); }
        
   } // Fin Ejercicio 9
   
   static void ejercicio_10(){
   /*
     10. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
         Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
         en caso contrario, se deberá imprimir “INCORRECTO”. 

     Nota: investigar la función Substring y equals() de Java.
   */
  
   String MENSAJE_CORRECTO = "CORRECTO";
   String MENSAJE_INCORRECTO = "INCORRECTO";
   
   String frase = "";
   Scanner leer = new Scanner(System.in);
   
   System.out.print(" Este programa nos pide que ingresemos una frase que empieze con la letra 'A'.\n");
   System.out.print(" Si ingresamos una frase válida, nos mostrará un mensaje de confirmación.");
   System.out.print(" Caso contrario nos mostrará un mensaje de error. \n");
   
   System.out.print("\n Por favor, ingrese la frase a evaluar: ");
   while (frase.equals("")) {frase = leer.nextLine();}
   
   if ( frase.substring(0,1).equals("A") ) { System.out.println(MENSAJE_CORRECTO); } else { System.out.println(MENSAJE_INCORRECTO); }
        
   } // Fin Ejercicio 10
   
   static void ejercicio_11(){
   /*
     11. Considera que estás desarrollando una web para una empresa que fabrica motores
         (suponemos que se trata del tipo de motor de una bomba para mover fluidos).

         -> Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.

     El programa debe mostrar lo siguiente:
     --------------------------------------
     - Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
     - Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
     - Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
     - Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
     - Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”.
   */
   
   Scanner leer = new Scanner(System.in);
   int opcion = -1;
   
   String MSG_MOTOR_1 = "La bomba es una bomba de agua";
   String MSG_MOTOR_2 = "La bomba es una bomba de gasolina";
   String MSG_MOTOR_3 = "La bomba es una bomba de hormigón";
   String MSG_MOTOR_4 = "La bomba es una bomba de pasta alimenticia";
   String MSG_MOTOR_DEFAULT = "No existe un valor válido para tipo de bomba";
   
   System.out.print("\n ¡Bienvenido al sistema web de [Empresa que fabrica motores]!\n");
   System.out.print("\n Por favor, ingrese el primer dígito del N° de Motor (1-4): ");
   while(opcion <= -1 || opcion > 4) {opcion = leer.nextInt();}
   
   int tipoMotor = opcion;
   
       switch (tipoMotor) {
           case 1:
               System.out.print("\n "+ MSG_MOTOR_1 + ".\n");
           break;
           
           case 2:
               System.out.print("\n "+ MSG_MOTOR_2 + ".\n");
           break;
           
           case 3:
               System.out.print("\n "+ MSG_MOTOR_3 + ".\n");
           break;
           
           case 4:
               System.out.print("\n "+ MSG_MOTOR_4 + ".\n");
           break;
           
           default:
               System.out.print("\n "+ MSG_MOTOR_DEFAULT + ".\n");
       } // Fin de switch(tipoMotor)
   
   } // Fin Ejercicio 11
   
   static void ejercicio_12(){
   /*
     12. Escriba un programa que valide si una nota está entre 0 y 10,
     sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. 
   */
   
   Scanner leer = new Scanner(System.in);
   double calif = -1.0;
   
   System.out.print("\n Por favor, ingrese un número entre 0 y 10: ");
   while(calif < 0 || calif > 10) {calif = leer.nextDouble();}
   
   System.out.print("\n El valor ingresado fue: " + calif  + ".\n");
   
   } // Fin Ejercicio 12
   
   static void ejercicio_13(){
   /*
     13. Escriba un programa en el cual se ingrese un valor límite positivo,
         y a continuación solicite números al usuario hasta que su suma
         supere el límite inicial. 
   */
   
   Scanner leer = new Scanner(System.in);
   float maxLimit = -1;
   float dump = 0;
   
   System.out.print("\n Este programa solicita se defina un límite positivo.");
   System.out.print("\n Seguidamente lee números ingresados por el usuario ");
   System.out.print("hasta que su suma supere el límite indicado.\n");
   System.out.print("\n Por favor, defina el valor límite: ");
   while(maxLimit < 0) {maxLimit = leer.nextFloat();}
   while(dump < maxLimit) {
       System.out.print("\n Total acumulado: " + dump + ".\n");
       System.out.print(" Por favor, ingrese el valor a sumar: ");
       dump = dump + leer.nextFloat();
   }
   
   System.out.print("\n El límite fijado fue: " + maxLimit  + ". El total acumulado final fue de: " + dump + ".\n");
   
   } // Fin Ejercicio 13
   
   static void ejercicio_14(){
   /*
   14. Realizar un programa que pida dos números enteros positivos por teclado y
       muestre por pantalla el siguiente menú:

    MENU
    =====
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir

    > Elija opción:

    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    -> El programa deberá ejecutarse hasta que se elija la opción 5.

    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
    se debe mostrar el siguiente mensaje de confirmación: "¿Está seguro que desea salir del programa (S/N)?"
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    */
   
   Scanner leer = new Scanner(System.in);
   int opcion = -1;
   int num_a = -1;
   int num_b = -1;
   
   String MSG_CONFIRM_EXIT = "¿Está seguro que desea salir del programa (S/N)?";
   String MENU = " MENU\n======\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n\n > Elija opción: ";
   
   String strConfirmExit = "Nopem8Iwannastay";
   
   boolean exit_menu = false;
   
   System.out.print("\n Este programa solicita se ingresen dos enteros positivos");
   System.out.print(" para luego presentar un menú de opciones.\n");
   
   System.out.print("\n Ingrese el primer valor: ");
   while(num_a <= 0) {num_a = leer.nextInt();}
   
   System.out.print("\n Ingrese el segundo valor: ");
   while(num_b <= 0) {num_b = leer.nextInt();}
   
   do{
      opcion = -1;
      
      System.out.print("\n" + MENU);
      while(opcion <= 0 || opcion > 5) {opcion = leer.nextInt();}
      
      switch (opcion) {
           case 1:
               // SUMAR
               System.out.print("\n La suma de " + num_a + " y " + num_b + " es igual a: " + (num_a + num_b) + ".\n");
           break;
           
           case 2:
               // RESTAR
               System.out.print("\n La resta de " + num_a + " y " + num_b + " es igual a: " + (num_a - num_b) + ".\n");
           break;
           
           case 3:
               // MULTIPLICAR
               System.out.print("\n El producto de " + num_a + " por " + num_b + " es igual a: " + (num_a * num_b) + ".\n");
           break;
           
           case 4:
               // DIVIDIR
               System.out.print("\n La división de " + num_a + " entre " + num_b + " es igual a: " + ( (double) (num_a / num_b) ) + ".\n");
           break;
           
           case 5:
               // SALIR
               strConfirmExit = "N";
               leer = new Scanner(System.in);
               
               System.out.print("\n " + MSG_CONFIRM_EXIT + ": ");
               strConfirmExit = leer.nextLine();
               
               if (strConfirmExit.substring(0,1).equals("S")) { exit_menu = true; }
               
           break;
           
           default:
           throw new AssertionError();
       }
   
     }while(!exit_menu);
   
   } // Fin Ejercicio 14
   
   static void ejercicio_15(){
   /*
     15. Escriba un programa que lea 20 números. Si el número leído es igual a cero
     se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".

     El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
     pero si el número es negativo no debe sumarse.

     Nota: recordar el uso de la sentencia break 
   */
   
   Scanner leer = new Scanner(System.in);
   int numActual = 0;
   int LIM_FOR = 20;
   
   String MSG_ZERO = "Se capturó el numero cero";
   
   float sumatoria = 0;
   float valorActual = -1;
   
   System.out.print("\n Este programa solicita y lee por teclado hasta que se ingrese 0, o se hayan leído 20 números.\n");
   System.out.print("\n Nota: Los números negativos serán ignorados.\n");
   
   for (numActual = 0; numActual < LIM_FOR; numActual++) {
       
       System.out.print("\n Total acumulado: " + sumatoria + ".\n");
       System.out.print(" Leyendo N° [" + (numActual + 1) + "] de [" + LIM_FOR + "], ingrese el valor a sumar: ");
       
       valorActual = leer.nextFloat();
       
       if (valorActual == 0 ) { 
          // If_zero
           System.out.print("\n" + MSG_ZERO + ".\n");
           break;
       } else { if (valorActual > 0) { sumatoria = sumatoria + valorActual; } }
       
   } // Fin for
   
   System.out.print("\n Se leyeron " + numActual + " valores. El total acumulado final fue de: " + sumatoria + ".\n");
   
   } // Fin Ejercicio 15
   
   static void ejercicio_16_b(){
   /*
     16. Realizar un programa que simule el funcionamiento de un dispositivo RS232,
     este tipo de dispositivo lee cadenas enviadas por el usuario.

     Las cadenas deben llegar con un formato fijo: 

     -> Tienen que ser de un máximo de 5 caracteres de largo
     -> Su primer carácter tiene que ser X y el último tiene que ser una O.
     ---> Las secuencias leídas que respeten el formato se consideran correctas
     -> La secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE)
     ---> y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

     Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.

     Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
   */
  
  String FDE = "&&&&&"; // String cierre mensaje (EoM)
   
   String codigo = "";
   Scanner leer = new Scanner(System.in);
   
   boolean analizandoCodigo = false;
   int posInicial = 0;
   
   int secuenciasValidas = 0;
   int secuenciasIncorrectas = 0;
   
   System.out.print("\n Este programa simula el funcionamiento de un dispositivo RS232.\n" +
                   " Lee cadenas con logitud de cinco (5) caracteres ingresadas por el usuario.\n" +
                   " Se considerarán válidas aquellas cadenas que comiencen con 'X' y terminen en 'O'.\n" +
                   " Ingrese la secuencia \"&&&&&\" para finalizar la ejecución. \n");
   
   System.out.print("\n Por favor, ingrese el código a analizar: ");
   
  do { codigo = leer.nextLine(); }while(codigo.equals("")); // SI EL STRING CODIGO NO ESTA DEFINIDO, LEERLO.
  
   if (codigo.length() < 5)
       { System.out.print("\n ERROR: CODIGO NO VALIDO.\n "); }
   else 
       { analizandoCodigo = true; }
  
  do {
      
      if ((codigo.length() - posInicial) < 5 )
         { secuenciasIncorrectas++; analizandoCodigo = false; break; }
      
      else { analizandoCodigo = true; }
      
      // ANALIZANDO CODIGO
      if (codigo.substring(posInicial,(posInicial + 1)).equals("&"))
         { 
    
         /* EL BLOQUE EMPIEZA CON & */ 
         if(codigo.substring(posInicial,(posInicial + 5)).equals(FDE))
           { secuenciasValidas++; analizandoCodigo = false; break; }
         
         else { secuenciasIncorrectas++; posInicial = posInicial + 5; }
         }
      
      else {
            if(codigo.substring(posInicial,(posInicial + 1)).equals("X"))
              { /*SI EMPIEZA EN X */ 
               
               if(codigo.substring((posInicial+4),(posInicial+5)).equals("O"))
                 { /* Y TERMINA EN O */
                  secuenciasValidas++; posInicial = posInicial + 5;
                 }
               
               else
                 { secuenciasIncorrectas++; posInicial = posInicial + 5; }

            } else { secuenciasIncorrectas++; posInicial = posInicial + 5; }
      
           }
      
      }while(analizandoCodigo);  
  
     System.out.print("\n INFORME FINAL:\n---------------\n");
     System.out.print(" En el código \"" + codigo + "\" se encontraron " + secuenciasValidas + " secuencias válidas y " + secuenciasIncorrectas + " secuencias NO válidas.\n" );
        
   } // Fin Ejercicio 16_b
   
   static void ejercicio_16(){
   /*
     16. Realizar un programa que simule el funcionamiento de un dispositivo RS232,
     este tipo de dispositivo lee cadenas enviadas por el usuario.

     Las cadenas deben llegar con un formato fijo: 

     -> Tienen que ser de un máximo de 5 caracteres de largo
     -> Su primer carácter tiene que ser X y el último tiene que ser una O.
     ---> Las secuencias leídas que respeten el formato se consideran correctas
     -> La secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE)
     ---> y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.

     Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.

     Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
   */
  
  String FDE = "&&&&&"; // String cierre mensaje (EoM)
   
  Scanner leer = new Scanner(System.in);
  
  int secuenciasValidas = 0;
  int secuenciasIncorrectas = 0;
  
  System.out.print("\n Este programa simula el funcionamiento de un dispositivo RS232.\n" +
                   " Lee cadenas con logitud de cinco (5) caracteres ingresadas por el usuario.\n" +
                   " Se considerarán válidas aquellas cadenas que comiencen con 'X' y terminen en 'O'.\n" +
                   " Ingrese la secuencia \"&&&&&\" para finalizar la ejecución. \n");

   String secuencia = leer.nextLine();
  
  while(! secuencia.equals(FDE) )
  {
      
    if (!(secuencia.length() == 5))
       { System.err.print(" AVISO: Secuencia de longitud inválida.\n"); secuenciasIncorrectas++; }
    else
       {
       if(secuencia.substring(0,1).equalsIgnoreCase("X") && secuencia.substring(4,5).equalsIgnoreCase("O"))
         { secuenciasValidas++; }
       else
         { secuenciasIncorrectas++; }
       }
    
    leer = new Scanner(System.in);
    secuencia = leer.nextLine();
  }
  
  System.out.print("\n INFORME FINAL:\n---------------\n");
  System.out.print(" Se ingresaron " + secuenciasValidas + " secuencias válidas y " + secuenciasIncorrectas + " secuencias NO válidas.\n" );
        
   } // Fin Ejercicio 16
   
   static void ejercicio_17(){
   
/*
  17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
      Por ejemplo
      si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
       
	 * * * *
         *     *
         *     *
         * * * *
*/
   
   Scanner leer = new Scanner(System.in);
   
   int lado = 0;
   int columna = 0;
   int linea = 0; 
	
    System.out.print("\n Este programa dibuja en consola un cuadrado de asteriscos del tamaño indicado.\n" +
                     "Por favor, ingrese el tamaño deseado del cuadrado a dibujar (1 - 20): ");
	
    do{ lado = leer.nextInt(); }while(lado <= 0 || lado > 20);
	
    for (linea = 1; linea <= lado; linea++)
	{
		
	if ((linea == 1) || (linea == lado)) 
           { // Tope y Base
            for (columna = 1; columna <= lado; columna++)
		{ System.out.print("* "); }
            
            System.out.print("\n"); // Cierro línea		
	   }
		
        else
			
            {
            System.out.print("* "); // Borde izq
            
            for (columna = 2; columna <= (lado-1); columna++)
                { System.out.print("  "); }
			
            System.out.print("* \n"); // Borde Derecho + Cierro línea
            }
		
        } // Fin for cuadrado.
   
   } // Fin Ejercicio 17
   
   static void ejercicio_18(){
    /* 
      18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
          el número ingresado seguido de tantos asteriscos como indique su valor.

      -> Por ejemplo:
         5 *****
         3 ***
         11 ***********
         2 **
    */
	   
    // Enteros ingresados por consola
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
        
    int curr = 0; // numero actual
    int count = 0; // contador

    System.out.print("\n Este programa lee 4 enteros positivos menores a 20 por teclado.\n" +
                     " Seguidamente muestra los números ingresados y la cantidad respectiva representada en asteriscos. \n" +
                     "\n Ingrese 4 valores enteros: ");

    Scanner leer = new Scanner(System.in);

    while (count <= 3)
        {
         while (curr <= 0 || curr > 21) { curr = leer.nextInt(); }
	 // VALOR VALIDO!
            
	 switch (count)
            {
            case 0:
                 a = curr; curr = -1;
            break;
                    
            case 1:
                 b = curr; curr = -1;
            break;
                    
                case 2:
                     c = curr; curr = -1;
                 break;
                    
                case 3:
                     d= curr; curr = -1;
                 break;
                    
                default:
                     System.out.print(" ERROR: unhandled exception!");
                    // TODO Learn exception handling in java ffs.
                break;
				} // Fin del Switch
             count++;
			} 

        System.out.print("VALORES INGRESADOS: " + "\u001B[36m" + a + ", " + b + ", " + c + " y " + d + ".\u001B[0m" + "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");
        
        for (count = 0; count < 4; count++)
			{
             switch (count) 
				{
				 case 0:
					 curr = a;
                 break;
                    
                case 1:
                     curr = b;
                break;
                    
                case 2:
                     curr = c;
                break;
                    
                case 3:
                     curr = d;
                break;
                    
                default:
                     System.out.print(" ERROR: unhandled exception!");
                     // TODO Learn exception handling in java ffs.
                 break;
				} // Fin switch
            
			System.out.print("\n" + "\u001B[37m" + curr + "\u001B[0m" + ": " + "\u001B[36m"); 
            
			// RESET: \u001B[0m
			// BLUE:\u001B[34m
			// CYAN: \u001B[36m
			
			for (curr = curr; curr > 0; curr--) { System.out.print('*'); }      
			System.out.println("\u001B[0m");
		}
	} // Fin ejercicio_18

   static void ejercicio_19(){
  /*
    19. Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
    por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.

    La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena,
    este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

    El cambio de divisas es:
       
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
  */

     String ANSI_RESET = "\033[0m";
     String USD_C = "\033[32;1m";
     String USD_S = "$";
     String EURO_C = "\033[33;1m";
     String EURO_S = "€";
     String GBP_C = "\033[34;1m";
     String GBP_S = "£";
     String JPY_C = "\033[35;1m";
     String JPY_S = "¥";

     Scanner leer = new Scanner(System.in);
     
     double monto = -1;
     String moneda = "pesitos argentos";

     System.out.print("\n Este programa solicita que se ingrese un monto en euros." +
                      "\n Luego, la moneda a la que se desea convertir ese monto (dólares, yenes o libras).\n" +
                      " La conversión se calcula en función de la siguiente tabla de cambio: \n" +
                      "\n\n " + EURO_C + "1" + EURO_S + " euro" + ANSI_RESET + " = " + GBP_C + " 0.86 " + GBP_S + " libras" + ANSI_RESET +
                      "\n " + EURO_C + "1" + EURO_S + " euro" + ANSI_RESET + " = " + USD_C + " 1,28611 " + USD_S + " dólares" + ANSI_RESET +
                      "\n " + EURO_C + "1" + EURO_S + " euro" + ANSI_RESET + " = " + JPY_C + " 129,852 " + JPY_S + " yenes" + ANSI_RESET + "\n\n"
                      );
     
     System.out.print(" Ingrese el monto a convertir: ");
     do{ monto = leer.nextDouble(); }while(monto <= 0);
     
     System.out.print("\n\n ¿A qué moneda desea convertir el monto?\n > (dólares / libras / yenes): ");
     do{ moneda = leer.nextLine(); }while( !( moneda.equalsIgnoreCase("dolares") || moneda.equalsIgnoreCase("dólares") || moneda.equalsIgnoreCase("libras") || moneda.equalsIgnoreCase("yenes") ));
     moneda = moneda.toUpperCase();
             
     convierteDinero(monto, moneda);
     
   } // Fin ejercicio_19
   
   static void ejercicio_20(){
  /*
     20. Realizar un algoritmo que rellene un vector con los 100 primeros
    números enteros y los muestre por pantalla en orden descendente.
  */

     int i = 0;
     short LIM = 100;
     short vector[];
     vector = new short[LIM];
     
     System.out.print("\n Este programa crea un vector y lo rellena con los \n"+
                      " primeros 100 enteros en orden descendente (de 100 a 1).\n\n");

     for(i = LIM; i > 0; i--)
         { vector[LIM-i] = (short) i; }

     for(i = 0; i < LIM; i++)
         { System.out.print(" La posición #" + "\033[35;1m" + (i+1) + "\033[0m" + " del vector contiene el valor: " + "\033[32;1m" + vector[i] + "\033[0m" + ".\n"); }
   
   } // Fin ejercicio_20
   
   static void ejercicio_21(){
  /*
    21. Realizar un algoritmo que rellene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un numero a buscar en el vector.
    
    El programa mostrará donde se encuentra el numero y si se encuentra repetido.
  */

     int i = 0;
     int tamanio_arreglo = -1;
     int nro_buscado = -1;
     int contador = -1;
     int vector[];
     
     Scanner leer = new Scanner(System.in);
     
     System.out.print("\n Este programa solicita se indique el tamaño de un vector, \n"+
                      " lo rellena con valores aleatorios y pide al usuario un valor " +
                      "a buscar en el mismo.\n" + 
                      " Finalmente, indica por pantalla el valor buscado, si lo ha encontrado y en qué posiciones. \n");

     System.out.print("\n Indique el tamaño del arreglo: ");
     do{ tamanio_arreglo = leer.nextInt(); }while(tamanio_arreglo <= 0);
     
     vector = new int[tamanio_arreglo];
     Random randomizer = new Random();
     
     System.out.print("\n << CARGANDO ARREGLO >>\n");
     
     for(i = 0; i < tamanio_arreglo; i++)
         { 
          vector[i] = randomizer.nextInt(10);
          
          if (i % 12 == 0) {System.out.print("\n");}
          
          if (! (i == (tamanio_arreglo - 1) ))
             {
             if (i == (tamanio_arreglo - 2) )
                { /* falta uno */ System.out.print(vector[i] + " y "); }
             else
                { /* quedan varios... */ System.out.print(vector[i] + ", "); }
             }
          else
            { /* Último valor */ System.out.print(vector[i] + ".\n"); }
         }
          
     System.out.print( "\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     System.out.print("\n Indique el valor a buscar en el arreglo (0~255): ");
     
     do{ nro_buscado = leer.nextInt(); }while(nro_buscado < 0);
     
     contador = 0;
     for(i = 0; i < tamanio_arreglo; i++)
         { 
             if (vector[i] == nro_buscado)
                {
                 System.out.print(" -> Se ha encontrado el valor [" + "\033[33;1m" + nro_buscado + "\033[0m" + "] en la posición #" + "\033[35;1m" + (i) + "\033[0m" + " del arreglo.\n");
                 contador++;
                }
         }
     
     if(! (contador == 0))
        {
        System.out.print("\n El valor [" + "\033[33;1m" + nro_buscado + "\033[0m" + "] fue encontrado un total de " + "\033[35;1m" + (contador) + "\033[0m" + " veces en el arreglo.\n");
        }
     else
        { System.err.print("\n No se ha encontrado el valor [" + nro_buscado + "] en el arreglo.\n"); }
             
   } // Fin ejercicio_21
      
   static void ejercicio_22(){
  /*
    22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 
        dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
  */

     int i = 0;
     int tamanio_arreglo = -1;
     int vector[];
     int num_por_cifras[];
     
     Scanner leer = new Scanner(System.in);
     
     System.out.print("\n Este programa solicita se indique el tamaño de un vector, \n"+
                      " lo rellena con valores aleatorios y luego clasifica y cuenta \n" +
                      " los valores en función de sus dígitos (de 1 a 5 cifras).\n"
                     );

     System.out.print("\n Indique el tamaño del arreglo: ");
     do{ tamanio_arreglo = leer.nextInt(); }while(tamanio_arreglo <= 0);
     
     vector = new int[tamanio_arreglo];
     Random randomizer = new Random();
     
     System.out.print("\n << CARGANDO ARREGLO >>\n");
     
     for(i = 0; i < tamanio_arreglo; i++)
         { 
          vector[i] = randomizer.nextInt(100000); // en caso de querer hacerlo para n cifras, se pone de límite 10^n, xq le resta 1 y ese es el límite máximo, en este caso 99999 (5 cifras)
          
          if (i % 9 == 0) {System.out.print("\n");}
          
          if (! (i == (tamanio_arreglo - 1) ))
             {
             if (i == (tamanio_arreglo - 2) )
                { /* falta uno */ System.out.print(vector[i] + " y "); }
             else
                { /* quedan varios... */ System.out.print(vector[i] + ", "); }
             }
          else
            { /* Último valor */ System.out.print(vector[i] + ".\n"); }
         }
          
     System.out.print( "\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     
     num_por_cifras = new int[5];
     
     for( i = 0; i < 5; i++) { num_por_cifras[i] = 0; }
     
     for(i = 0; i < tamanio_arreglo; i++)
         {
          if( vector[i] < 10 )
            { num_por_cifras[0]++; } // 1 cifra
          else
            {
            if( vector[i] < 100 )
                { num_por_cifras[1]++; } // 2 cifras
            else
                {
                if( vector[i] < 1000)
                    { num_por_cifras[2]++; } // 3 cifras
                else
                    {
                    if(vector[i] < 10000)
                        { num_por_cifras[3]++; } // 4 cifras
                    else
                        {
                         if(vector[i] < 100000)
                            { num_por_cifras[4]++; } // 5 cifras
                         else
                            { 
                                /* ERROR: UNEXPECTED VALUE! */
                                System.err.print("\n ERROR: Valor [" + vector[i] + "] NO esperado.\n");
                            }
                        }
                    }
                }
            } // Fin if's
         } // Fin for.
     
     System.out.print("\n En el arreglo se encontraron: \n  ============================\n\n");
     
     for(i = 0; i < 5; i++)
        {
         if (i != 5)
            { System.out.print(" " + "\033[35;1m" + num_por_cifras[i] + "\033[0m" + " valores de " + (i+1) + " cifras.\n" ); }
         else
            { 
            if (num_por_cifras[i] > 0)
                { System.err.println(" Se encontraron " + num_por_cifras[i] + "valores NO esperados."); }
            }
        }
             
   } // Fin ejercicio_22
   
   static void ejercicio_23(){
  /*
    23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        y muestre la traspuesta de la matriz.
  */

     System.out.print("\n Este programa crea una matriz de 4 x 4, la rellena con valores aleatorios \n"+
                      " y luego muestra su transpuesta. \n"
                      );
       
     int columnas = 0;
     int filas = 0;
     int matriz[][] = new int[4][4];
     int transpuesta[][] = new int[4][4];
     
     for(columnas = 0; columnas < 3; columnas++)
        {
        for(filas = 0; filas < 3; filas++)
            {
            matriz[columnas][filas] = 0;
            transpuesta[columnas][filas] = 0;
            }
        }
     
     Random randomizer = new Random();
     
     System.out.print("\n << CARGANDO ARREGLO >>\n");
     
     for(filas = 0; filas < 4; filas++)
        {
        System.out.println("");
        for(columnas = 0; columnas < 4; columnas++)
            {
             matriz[columnas][filas] = randomizer.nextInt(10);
             
             System.out.print("[" + matriz[columnas][filas] + "]");
             if (columnas != 3)
                { System.out.print(", "); }
            }
        }
          
     System.out.print( "\n\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     
     System.out.print("\n << TRANSPONIENDO MATRIZ >>\n");
     
     for(filas = 0; filas < 4; filas++)
        {
         for(columnas = 0; columnas < 4; columnas++)
            { transpuesta[filas][columnas] = matriz[columnas][filas]; }
        }
     
     System.out.print( "\n \033[32;1m" + "<< MATRIZ TRANSPUESTA >>\n" + "\033[0m" );
     
     for(filas = 0; filas < 4; filas++)
        {
         System.out.println("");
         for(columnas = 0; columnas < 4; columnas++)
            { 
             System.out.print("[" + transpuesta[columnas][filas] + "]");
             if (columnas != 3)
                { System.out.print(", "); }
            }
        }
     
     System.out.println("");
             
   } // Fin ejercicio_23
   
   static void ejercicio_24(){
  /*
    24. Realice un programa que compruebe si una matriz dada es anti simétrica.
    Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
    Es decir, A es anti simétrica si A = -AT.
  */

     System.out.print("\n Este programa lee una matriz ingresada por el usuario \n" +
                      " y analiza si es antisimética. \n"
                      );
       
     int columnas_matriz = -1;
     int filas_matriz = -1;
     
     int columna_actual = 0;
     int fila_actual = 0;
     
     Scanner leer = new Scanner(System.in);
     
     // int matriz[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
     
     System.out.print("\n Indique las columnas que tendrá la matriz: ");
     do{ columnas_matriz = leer.nextInt(); }while(columnas_matriz <= 0);
     
     System.out.print(" Indique las filas que tendrá la matriz: ");
     do{ filas_matriz = leer.nextInt(); }while(filas_matriz <= 0);
     
     if(columnas_matriz != filas_matriz)
        { System.out.println("\033[31;1m" + "\n La matriz se considera no-antisimétrica por definición." + "\033[0m"); return; }
     
     ////////////////////////////////////////////////////
     
     int matriz[][] = new int[columnas_matriz][filas_matriz];
     int transpuesta[][] = new int[filas_matriz][columnas_matriz];
    
     for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
        {
        for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
            {
            matriz[columna_actual][fila_actual] = 0;
            transpuesta[fila_actual][columna_actual] = 0;
            }
        }
     
     ///////////////////////////////////////////////////////////
     
     System.out.print("\n << CARGANDO ARREGLO >>\n\n");
     
     leer = new Scanner(System.in);
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
                System.out.print(" Ingrese el elemento[" + (columna_actual + 1) + "][" + (fila_actual + 1) + "]: ");
                matriz[columna_actual][fila_actual] = leer.nextInt();
            }
        }
     
     ///////////////////////////////////////////////////
     
     System.out.print( "\n\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        System.out.println("");
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
             if(matriz[columna_actual][fila_actual] >= 0)
                { System.out.print(" "); }
             
             System.out.print("[" + matriz[columna_actual][fila_actual] + "]");
             if (columna_actual != (columnas_matriz - 1))
                { System.out.print(", "); }
            }
        }
     
     ///////////////////////////////////////////////////////////
     
     System.out.print("\n\n << TRANSPONIENDO MATRIZ >>\n");
     
     for(fila_actual = 0; fila_actual < (filas_matriz); fila_actual++)
        {
         for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            { transpuesta[fila_actual][columna_actual] = matriz[columna_actual][fila_actual]; }
        }
    
     ///////////////////////////////////////////////////////////
          
     for(fila_actual = 0; fila_actual < columnas_matriz; fila_actual++)
        {   
         System.out.println("");
         for(columna_actual = 0; columna_actual < filas_matriz; columna_actual++)
            {      
             if(transpuesta[columna_actual][fila_actual] >= 0)
                { System.out.print(" "); }
             
             System.out.print("[" + transpuesta[columna_actual][fila_actual] + "]");
             if (columna_actual != (filas_matriz - 1))
                { System.out.print(", "); }
            }
        }
     
     System.out.print( "\n\n" + " \033[32;1m" + "<< MATRIZ TRANSPUESTA >>\n" + "\033[0m" );
     
     
          /*
       Para que sea asimétrica se tiene que cumplir que:
     
        matriz[x][y] == (-1) * transpuesta[x][y]
     
        Para simplificar el proceso, usaremos una variable booleana
        inicializada como verdadero, y ante el primer caso donde NO
        se cumpla la condición, saldremos del bucle.
     
     */

     boolean esAntisimetrica = true;
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        if(fila_actual > (columnas_matriz - 1))
               { break; }
        
        if(!esAntisimetrica) {break;}
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
            if(!esAntisimetrica) {break;}
            
            if(columna_actual > (filas_matriz - 1))
               { break; }
             
            if(!( matriz[columna_actual][fila_actual] == ( (-1) * transpuesta[columna_actual][fila_actual]) ))
               { esAntisimetrica = false; }
            }
        }
     
     if(esAntisimetrica)
        { System.out.println("\033[32;1m" + "\n La matriz ingresada es Antisimétrica." + "\033[0m"); }
     else
        { System.out.println("\033[31;1m" + "\n La matriz ingresada NO es Antisimétrica." + "\033[0m"); }
             
   } // Fin ejercicio_24
   
   static void ejercicio_24_b(){
  /*
    24. Realice un programa que compruebe si una matriz dada es anti simétrica.
    Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
    Es decir, A es anti simétrica si A = -AT.
  */

     System.out.print("\n Este programa lee una matriz ingresada por el usuario \n" +
                      " y analiza si es antisimética. \n"
                      );
       
     int columnas_matriz = -1;
     int filas_matriz = -1;
     
     int columna_actual = 0;
     int fila_actual = 0;
     
     Scanner leer = new Scanner(System.in);
     
     // int matriz[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
     
     System.out.print("\n Indique las columnas que tendrá la matriz: ");
     do{ columnas_matriz = leer.nextInt(); }while(columnas_matriz <= 0);
     
     System.out.print("\n Indique las filas que tendrá la matriz: ");
     do{ filas_matriz = leer.nextInt(); }while(filas_matriz <= 0);
     
     ////////////////////////////////////////////////////
     
     int matriz[][] = new int[columnas_matriz][filas_matriz];
     int transpuesta[][] = new int[filas_matriz][columnas_matriz];
    
     for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
        {
        for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
            {
            /////////// matriz[columna_actual][fila_actual] = 0;
            transpuesta[fila_actual][columna_actual] = 0;
            //System.out.println(" MAT[" + columna_actual + "][" + fila_actual + "] | TRANSP: [" + fila_actual + "][" + columna_actual + "]");
            }
        }
     
     Random randomizer = new Random();
     
     ///////////////////////////////////////////////////////////
     
     System.out.print("\n << CARGANDO ARREGLO >>\n");
     
     // FIX ME: pedir datos por teclado
     
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        System.out.println("");
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
             matriz[columna_actual][fila_actual] = randomizer.nextInt(10);
             
             if(randomizer.nextBoolean())
                { matriz[columna_actual][fila_actual] = matriz[columna_actual][fila_actual] * -1; }
             
             if(matriz[columna_actual][fila_actual] >= 0)
                { System.out.print(" "); }
             
             System.out.print("[" + matriz[columna_actual][fila_actual] + "]");
             if (columna_actual != (columnas_matriz - 1))
                { System.out.print(", "); }
            }
        }
     
     ///////////////////////////////////////////////////////////
     
     System.out.print( "\n\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     
     System.out.print("\n << TRANSPONIENDO MATRIZ >>\n");
     
     for(fila_actual = 0; fila_actual < (filas_matriz); fila_actual++)
        {
         for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            { transpuesta[fila_actual][columna_actual] = matriz[columna_actual][fila_actual]; }
        }
     
     
     ///////////////////////////////////////////////////////////
          
     for(fila_actual = 0; fila_actual < columnas_matriz; fila_actual++)
        {   
         System.out.println("");
         for(columna_actual = 0; columna_actual < filas_matriz; columna_actual++)
            {      
             if(transpuesta[columna_actual][fila_actual] >= 0)
                { System.out.print(" "); }
             
             System.out.print("[" + transpuesta[columna_actual][fila_actual] + "]");
             if (columna_actual != (filas_matriz - 1))
                { System.out.print(", "); }
            }
        }
     
     System.out.print( "\n\n" + " \033[32;1m" + "<< MATRIZ TRANSPUESTA >>\n" + "\033[0m" );
     
     
          /*
       Para que sea asimétrica se tiene que cumplir que:
     
        matriz[x][y] == (-1) * transpuesta[x][y]
     
        Para simplificar el proceso, usaremos una variable booleana
        inicializada como verdadero, y ante el primer caso donde NO
        se cumpla la condición, saldremos del bucle.
     
     */

     boolean esAntisimetrica = true;
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        if(fila_actual > (columnas_matriz - 1))
               { break; }
        
        if(!esAntisimetrica) {break;}
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
            if(!esAntisimetrica) {break;}
            
            if(columna_actual > (filas_matriz - 1))
               { break; }
             
            if(!( matriz[columna_actual][fila_actual] == ( (-1) * transpuesta[columna_actual][fila_actual]) ))
               { esAntisimetrica = false; }
            }
        }
     
     if(esAntisimetrica)
        { System.out.println("\033[32;1m" + "\n La matriz ingresada es Antisimétrica." + "\033[0m"); }
     else
        { System.out.println("\033[31;1m" + "\n La matriz ingresada NO es Antisimétrica." + "\033[0m"); }
             
   } // Fin ejercicio_24_b (llenado automático)
   
   static void ejercicio_25(){
   /*
   25. Un cuadrado mágico es una matriz formada por números del 1 al 9
       donde la suma de sus filas, sus columnas y sus diagonales son idénticas.

       Crear un programa que permita introducir un cuadrado por teclado y
       determine si este cuadrado es mágico o no. El programa deberá comprobar 
       que los números dados son correctos, es decir, están entre el 1 y el 9.
   */
   
   System.out.print("\n Este programa lee una matriz ingresada por el usuario \n" +
                      " y analiza si es mágica o no. \n"
                      );
       
     int columnas_matriz = -1;
     int filas_matriz = -1;
     
     int columna_actual = 0;
     int fila_actual = 0;
     
     int valor_magico = 0;
     
     Scanner leer = new Scanner(System.in);
     
     System.out.print("\n Indique las columnas que tendrá la matriz: ");
     do{ columnas_matriz = leer.nextInt(); }while(columnas_matriz <= 0);
     
     System.out.print(" Indique las filas que tendrá la matriz: ");
     do{ filas_matriz = leer.nextInt(); }while(filas_matriz <= 0);
     
     if(columnas_matriz != filas_matriz)
        { System.out.println("\033[31;1m" + "\n Por definición sólo matrices cuadradas cumplen los criterios." + "\033[0m"); return; }
     
     ////////////////////////////////////////////////////
     
     int matriz[][] = new int[columnas_matriz][filas_matriz];
     
     for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
        {
        for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
            { matriz[columna_actual][fila_actual] = 0; }
        }
     
     ///////////////////////////////////////////////////////////
     
     System.out.print("\n << CARGANDO ARREGLO >>\n\n");
     
     leer = new Scanner(System.in);
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
                do{
                   System.out.print(" Ingrese el elemento[" + (columna_actual + 1) + "][" + (fila_actual + 1) + "]: ");
                   matriz[columna_actual][fila_actual] = leer.nextInt();
                   
                   if(columnas_matriz == 3)
                     { 
                      // Si el lado de la matriz igual a 3,
                      // permitiremos números entre 1 y 9.
                      // Caso contrario, los convertimos a 0 para que el usuario
                      // los ingrese nuevamente.
                      if(matriz[columna_actual][fila_actual] > 9)
                        { matriz[columna_actual][fila_actual] = 0; }
                     }
                   
                  }while(matriz[columna_actual][fila_actual] <= 0);
                
            }
        }
     
     ///////////////////////////////////////////////////
     
     System.out.print( "\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        System.out.println("");
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {
             if(matriz[columna_actual][fila_actual] < 10)
                { System.out.print(" "); }
             
             System.out.print("[" + matriz[columna_actual][fila_actual] + "]");
             if (columna_actual != (columnas_matriz - 1))
                { System.out.print(", "); }
            }
        }
     
     ///////////////////////////////////////////////////////////
     
     /*
       Para que sea mágica se tiene que cumplir que:
     
        - La sumatoria de los elementos en cada una de sus filas debe ser igual
          al valor "mágico"*
     
       (*) valor_magico = matriz[0][y] + ... + matriz[n-1][y] + matriz[n][y]; 
     
        - La sumatoria de los elementos en cada una de sus columnas debe ser
          igual al valor "mágico"
     
        - La sumatoria de su diagonal principal (y la contraria de ésta) deben
          ser iguales al valor "mágico"
     
        for(i = 0; i < lado; i++)
            { sumatoria = sumatoria + matriz[i][i]; } // Diag. ppal
     
        for(i = 0; i < lado; i++)
            { sumatoria = sumatoria + matriz[i][((lado-1) - i)]; } // Diag. inv.
     
     */

     boolean esMagica = true;
     boolean valorYaDefinido = false;
     
     valor_magico = 0;
     int sumatoria[] = new int[(filas_matriz + columnas_matriz + 3)];
     
     /*
     matriz n*n
     0:{valor_magico} 1 a n:{sum_filas} n+1 a 2*n{sum_columnas}
     2n+1{diag_p} 2n+2{diag_i}
     */
     
     int i = 0;
     for(i = 0; i < (filas_matriz + columnas_matriz + 2); i++)
        { sumatoria[i] = 0; }
     
     for(fila_actual = 0; fila_actual < filas_matriz; fila_actual++)
        {
        for(columna_actual = 0; columna_actual < columnas_matriz; columna_actual++)
            {   
            if(!valorYaDefinido)
                { valor_magico = valor_magico + matriz[columna_actual][fila_actual]; }
            
            // SUMAMOS EN FILA ACTUAL
            sumatoria[(fila_actual+1)] = sumatoria[(fila_actual+1)] + matriz[columna_actual][fila_actual];
            
            // SUMAMOS EN COLUMNA ACTUAL
            sumatoria[(filas_matriz + columna_actual + 1)] = sumatoria[(filas_matriz + columna_actual + 1)] + matriz[columna_actual][fila_actual];
            
            if(columna_actual == fila_actual) // DIAG PPAL
                { sumatoria[(filas_matriz + columnas_matriz + 1)] = sumatoria[(filas_matriz + columnas_matriz + 1)] + matriz[columna_actual][fila_actual]; }
            
            if (fila_actual == ((filas_matriz - 1) - columna_actual)) // DIAG INV
                { sumatoria[(filas_matriz + columnas_matriz + 2)] = sumatoria[(filas_matriz + columnas_matriz + 2)] + matriz[columna_actual][fila_actual]; }
            
            }
        valorYaDefinido = true;
        }
     
     sumatoria[0] = valor_magico;
     
     for(i = 1; i <= (filas_matriz + columnas_matriz + 2); i++)
        {
         if(sumatoria[i] != valor_magico)
            { esMagica = false; break; }
        }
     
     if(esMagica)
        { System.out.println("\033[32;1m" + "\n\n La matriz ingresada es \"Magica\"" + "\033[0m"); }
     else
        { System.out.println("\033[31;1m" + "\n\n La matriz ingresada NO es \"Mágica\"." + "\033[0m"); }
   
   } // Fin ejercicio_25
   
   static void ejercicio_26()
 {
  /*
    26. Dadas dos matrices cuadradas de números enteros:
        la matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa
        que compruebe si la matriz P está contenida dentro de la matriz M.
     
        Para ello se debe verificar si entre todas las submatrices de 3x3 que se
        pueden formar en la matriz M, desplazándose por filas o columnas,
        existe al menos una que coincida con la matriz P.
     
        En ese caso, el programa debe indicar la fila y la columna de la matriz
        M en la cual empieza el primer elemento de la submatriz P.
  */

     System.out.print("\n Este programa lee una matriz de 3x3 ingresada por el usuario \n" +
                      " y analiza si se encuentra contenida dentro de otra matriz de 10x10. \n"
                      );
       
     int columnas_matriz_mayor = 10;
     int filas_matriz_mayor = 10;
     
     int columnas_matriz_buscada = 3;
     int filas_matriz_buscada = 3;
     
     
     int columna_actual = 0;
     int fila_actual = 0;
     
     // int matriz[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
     
     int matriz_mayor[][] = {{ 1, 11, 56, 41, 32, 99, 67, 98, 24, 21},
                             {26, 12, 78, 87, 76, 13, 78, 45, 67, 68},
                             {36, 13, 87, 24, 79, 54, 87, 34, 97, 78},
                             {47, 21, 90, 56,  1, 88, 45, 23, 46, 98},
                             { 5, 41,  9, 97, 36, 89, 14, 32, 87, 90},
                             { 6, 22, 90, 74,  5, 90, 22, 56, 13, 67},
                             {72, 67, 17, 87, 67, 75, 26, 74, 67, 12},
                             {81, 20, 12, 42, 96, 12, 42, 16, 89, 41},
                             {95, 10, 87, 64, 12, 41, 56, 19, 93, 65},
                             {10, 61, 67, 35, 11, 76, 78, 18, 24, 12}};
     
     /*
     int matriz_buscada[][] = {{36,  5, 67},
                               {89, 90, 75},
                               {14, 22, 26}};
     */
     
     int matriz_buscada[][] = new int[columnas_matriz_buscada][filas_matriz_buscada];
     
     for(columna_actual = 0; columna_actual < columnas_matriz_buscada; columna_actual++)
        {
        for(fila_actual = 0; fila_actual < filas_matriz_buscada; fila_actual++)
            { matriz_buscada[columna_actual][fila_actual] = 0; }
        }
     
     ///////////////////////////////////////////////////////////
     
     System.out.print("\n << MOSTRANDO ARREGLO >>\n");
     
     for(fila_actual = 0; fila_actual < filas_matriz_mayor; fila_actual++)
        {
        System.out.println("");
        for(columna_actual = 0; columna_actual < columnas_matriz_mayor; columna_actual++)
            {
             if(matriz_mayor[columna_actual][fila_actual] < 10)
                { System.out.print(" "); }
             
             System.out.print("[" + matriz_mayor[columna_actual][fila_actual] + "]");
             if (columna_actual != (columnas_matriz_mayor - 1))
                { System.out.print(", "); }
            }
        }
     
     System.out.print("\n\n");
     
     Scanner leer = new Scanner(System.in);
     
     for(fila_actual = 0; fila_actual < filas_matriz_buscada; fila_actual++)
        {
        for(columna_actual = 0; columna_actual < columnas_matriz_buscada; columna_actual++)
            {
                System.out.print(" Ingrese el elemento[" + (columna_actual + 1) + "][" + (fila_actual + 1) + "]: ");
                matriz_buscada[columna_actual][fila_actual] = leer.nextInt();
            }
        }
     
     ///////////////////////////////////////////////////
     
     System.out.print( "\n \033[32;1m" + "<< ARREGLO INICIALIZADO >>\n" + "\033[0m" );
     
     for(fila_actual = 0; fila_actual < filas_matriz_buscada; fila_actual++)
        {
        System.out.println("");
        for(columna_actual = 0; columna_actual < columnas_matriz_buscada; columna_actual++)
            {
             if(matriz_buscada[columna_actual][fila_actual] < 10)
                { System.out.print(" "); }
             
             System.out.print("[" + matriz_buscada[columna_actual][fila_actual] + "]");
             if (columna_actual != (columnas_matriz_buscada - 1))
                { System.out.print(", "); }
            }
        }
     
     System.out.println("");
     
     ///////////////////////////////////////////////////////////
     
     boolean primerValorEncontrado = false;
     boolean esSubcontenida = false;
     int encontrado_en_columna = 0;
     int encontrado_en_fila = 0;
     
     for(fila_actual = 0; fila_actual < (filas_matriz_mayor); fila_actual++)
        {
         if(esSubcontenida) { break; }
                 
         for(columna_actual = 0; columna_actual < columnas_matriz_mayor; columna_actual++)
            { 
             if( matriz_mayor[columna_actual][fila_actual] == matriz_buscada[0][0] )
                { primerValorEncontrado = true; }
             
             if(primerValorEncontrado)
                {
                 encontrado_en_columna = columna_actual;
                 encontrado_en_fila = fila_actual;
                 
                 for( fila_actual = encontrado_en_fila; fila_actual < (encontrado_en_fila + filas_matriz_buscada); fila_actual++ )
                    {
                     if(!primerValorEncontrado)
                        { break; }
                        
                     for( columna_actual = encontrado_en_columna; columna_actual < (encontrado_en_columna + columnas_matriz_buscada); columna_actual++ )
                     {
                      /* DEBUG
                      System.out.print("\n Elemento [" + (columna_actual - encontrado_en_columna) +
                                       "][" + (fila_actual - encontrado_en_fila) + "]: " + 
                                        matriz_mayor[columna_actual][fila_actual] + 
                                       ". Valor buscado: " + matriz_buscada[(columna_actual - encontrado_en_columna)][(fila_actual - encontrado_en_fila)] +
                                       ".");
                      */
                         
                      if(matriz_mayor[columna_actual][fila_actual] != matriz_buscada[(columna_actual - encontrado_en_columna)][(fila_actual - encontrado_en_fila)])
                        {
                        primerValorEncontrado = false;
                        columna_actual = encontrado_en_columna;
                        fila_actual = encontrado_en_fila;
                        encontrado_en_columna = -1;
                        encontrado_en_fila = -1;
                        break;
                        }
  
                     }
                    }
                 
                 if(primerValorEncontrado && columna_actual == (encontrado_en_columna + columnas_matriz_buscada) && fila_actual == (encontrado_en_fila + filas_matriz_buscada))
                    { esSubcontenida = true; break; }
                 
                }
            }
        }
    
     ///////////////////////////////////////////////////////////
          
     if(esSubcontenida)
        { 
         System.out.println("\033[32;1m" + "\n La matriz buscada se encontró en la posición " +
                            "\033[35;1m" + "[" + (encontrado_en_columna + 1) + "][" + (encontrado_en_fila + 1) + "]" + "\033[32;1m" + ".\n" + "\033[0m"); }
     else
        { System.out.println("\033[31;1m" + "\n La matriz buscada no se encuentra subcontenida en la matriz dada." + "\033[0m"); }
             
   } // Fin ejercicio_26

   
     //////////////////////////////
    /* -==[ Otras funciones]==- */
   //////////////////////////////
   
   static void convierteDinero(double monto, String moneda)
   {
     // Podría pasar estas variables a public static strings y pasar el scope a la clase entera...
     String ANSI_RESET = "\033[0m";
     String USD_C = "\033[32;1m";
     String USD_S = "$";
     String EURO_C = "\033[33;1m";
     String EURO_S = "€";
     String GBP_C = "\033[34;1m";
     String GBP_S = "£";
     String JPY_C = "\033[35;1m";
     String JPY_S = "¥";
    
     // Podria usar BigDecimal para acomodar el formato de los resultados...
     
     switch (moneda)
         {
           case "DOLARES":
           case "DÓLARES":
                 System.out.print("\n " + EURO_C + monto + " " + EURO_S + " euros" + ANSI_RESET + " equivalen a: " + USD_C + (monto * 1.28611) + USD_S + " dólares estadounidenses.\n" + ANSI_RESET);  
           break;
           
           case "YENES":
                 System.out.print("\n " + EURO_C + monto + EURO_S + " euros" + ANSI_RESET + " equivalen a: " + JPY_C + (monto * 129.852) + JPY_S + " yenes japoneses.\n" + ANSI_RESET);  
           break;
           
           case "LIBRAS":
               System.out.print("\n" + EURO_C + monto + EURO_S + " euros" + ANSI_RESET + " equivalen a: " + GBP_C + (monto * 0.86) + GBP_S + " libras esterlinas.\n" + ANSI_RESET);  
           break;
           
           default:
               throw new AssertionError();
         } // Fin del switch
       
   } // Fin convierteDinero (inv dsd ejercicio_19)
   
} // End of Class