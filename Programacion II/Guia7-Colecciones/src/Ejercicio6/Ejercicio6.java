/*6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el precio que tendrán. Además, 
se necesita que la aplicación cuente con las funciones básicas. Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y 
de valor el precio. Realizar un menú para lograr todas las acciones previamente mencionadas. */
package Ejercicio6;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Esteban
 */
public class Ejercicio6 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el hashMap
        HashMap<String, Double> tiendas = new HashMap();
        boolean menu = true;
        while (menu) {
            System.out.println(" ***********************************");
            System.out.println(" *           MENU PRINCIPAL        *");
            System.out.println("1*          Ingresar un producto   *");
            System.out.println("2*          Eliminar Producto      *");
            System.out.println("3*          Modificar Precio       *");
            System.out.println("4*          Mostrar Productos      *");
            System.out.println("5*          Salir                  * ");
            System.out.println(" ***********************************");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:{
                     System.out.println("Ingrese Producto");
                    String prod = leer.next();
                    System.out.println("Ingrese Precio");
                    double precio = leer.nextDouble();
                    tiendas.put(prod, precio);
                    break;
                }
                case 2: {
                    int var = 0;
                    String id = "";
                    System.out.println("Ingrese Producto que va a eliminar");
                    String pro = leer.next();
                    for (Map.Entry<String, Double> entry : tiendas.entrySet()) {
                        System.out.println(entry.getKey());
                        if (pro.equals(entry.getKey())) {
                            // esta forma es por posicion ---------id=entry.getKey();-----
                            var = 1;
                            break;
                        }
                    }
                    if (var == 0) {
                        System.out.println("producto No encontrado");
                    }
                    if (var == 1) {
                        System.out.println("archivo removido exitosamente");
                        tiendas.remove(pro);
                    }
                    break;
                }
                case 3: {
                    int var = 0;
                    String id = "";
                    double pre = 0.0;
                    System.out.println("Ingrese Producto que va a Modificar");
                    String pro = leer.next();
                    for (Map.Entry<String, Double> entry : tiendas.entrySet()) {
                        System.out.println(entry.getKey());
                        System.out.println(entry.getValue());
                        if (pro.equals(entry.getKey())) {
                            id = entry.getKey();
                            pre = entry.getValue();
                            var = 1;
                            break;
                        }
                    }
                    if (var == 1) {
                        System.out.println("ingrese Nuevo Precio");
                        Double precioso = leer.nextDouble();
                        tiendas.put(pro, precioso);
                        System.out.println("PRCIO MODIFICADO");
                    } else {
                        System.out.println("Producto no se encontro");
                    }
                    break;
                }
                case 4: {
                    for (Map.Entry<String, Double> entry : tiendas.entrySet()) {
                        System.out.println("Producto=" + entry.getKey() + ", precio=" + entry.getValue());
                    }
                    break;
                }
                default: {
                    menu = false;
                    System.out.println("uted salio del sistema");
                    break;
                }
            }
        }
    }
}
