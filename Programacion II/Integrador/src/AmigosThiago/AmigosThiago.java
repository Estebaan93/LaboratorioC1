/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmigosThiago;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class AmigosThiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String friends[] = new String[]{"Luchi", "Vicko", "Pablo", "Thiago"};
        List<String> list = Arrays.asList(friends);
        for (String f : friends) {System.out.println(f); }
        Iterator m = list.iterator(); String amix = "";

        while (m.hasNext()) {
            amix = (String) m.next();
            if (amix.equals("Thiago")) {
                System.out.printf("Pero si es. ..%s\n", amix.getClass().getSimpleName());}

        }}
}
