/*3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos)
y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al 
usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número  de cartas. En caso de que haya menos
cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara
esa primera carta. */
package Ejercicio3;

/**
 *
 * @author Esteban
 */
public class Baraja {
    private Carta cartas[];
    private int posSiguienteCarta;
   //private Palos palo;
    
      public static final int NUM_CARTAS=40;            //Constante
     

    public Baraja() {
        this.cartas = new Carta[NUM_CARTAS];
        this.posSiguienteCarta = 0;
        crearBaraja();
        barajar();
    }
    
    private void crearBaraja(){
        String [] palos= Carta.palos;
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {
                if ( ! (j==7 || j==8)) {
                    if (j>=9) {
                        cartas[ ( i * ((Carta.LIMITE_CARTA_PALO-2)) + (j -2)) ]= new Carta(j+1, palos[i]);
                    }else{
                        cartas[ ( i * ((Carta.LIMITE_CARTA_PALO-2)) + j ) ]= new Carta(j+1, palos[i]);
                    }
                    
                }
                
            }
        }
    }
    
   public void barajar(){
       int posAleatoria=0;
       Carta c;
       for (int i = 0; i < cartas.length; i++) {
           posAleatoria=(int) (Math.random() * (0 - (NUM_CARTAS + 1)) + ((NUM_CARTAS-1) + 1));
           c= cartas[i];
           cartas[i]= cartas[posAleatoria];
           cartas[posAleatoria]=c;
       }
       this.posSiguienteCarta = 0;
   } 
    
    public Carta siguienteCarta(){
        Carta c=null;
        if (posSiguienteCarta==NUM_CARTAS) {
            System.out.println("No hay mas cartas, barajando de nuevo");
        }else{
            c=cartas [posSiguienteCarta++];
        }
        
        return c;
        
    }
   
   public Carta[] darCartas(int numCartas){
       if (numCartas>NUM_CARTAS) {
           System.out.println("No hay mas cartas en el mazo");
       }else {
           if (cartasDisponibles()<numCartas) {
               System.out.println("No hay cartas que mostrar");
           }else{
               Carta [] cartasDar= new Carta[numCartas];
               for (int i = 0; i < cartasDar.length; i++) {
                   cartasDar[i]=siguienteCarta();
               }
               return cartasDar;
           }
       }
       return null;
   }
   
   
   public int cartasDisponibles(){
       return NUM_CARTAS-posSiguienteCarta;
   }
   
   
   public void cartasMonton(){
       if (cartasDisponibles()==NUM_CARTAS) {
           System.out.println("No se saco ninguna carta");
       }else{
           for (int i = 0; i < posSiguienteCarta; i++) {
               System.out.println(cartas[i]);
       }
      }
       
   }
   
   public void mostrarBaraja(){
       if (cartasDisponibles()==0) {
           System.out.println("No hay cartas que mostrar");
       }else{
                  for (int i = posSiguienteCarta; i <cartas.length ; i++) {
                      System.out.println(cartas[i]);
       }
       }

   }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", posSiguienteCarta=" + posSiguienteCarta + '}';
    }
   
   
}
