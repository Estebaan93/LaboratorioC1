/*Provocamo un erro exception de tipo IOException: 
Esta exception trata sobre entrada o salida de archivos
Leer un archivo de red y se desconecto, leer un archivo local que ya no esta disponible, intentar leer/escribir un archivo pero ya no tiene permisos, etc*/
package ExceptionIo;

import java.io.IOException;

/**
 *
 * @author Esteban
 */
public class ExceptionIo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //

    }

    public static void hacerAlgo() {
        String path="C://datos/imagen1.jpg";
      //  try {
            guardarFoto(path);
            System.out.println("Foto guardada");
       // } catch (IOException ex){
            System.out.println("Error al guardar la foto ");
       // }
        System.out.println("Proceso final");
    }
            //Se imprime "Error al Guardar la foto" "Proceso Final"
    private static void guardarFoto(String path) {
        
    }

}
