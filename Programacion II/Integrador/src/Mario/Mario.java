/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mario;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> aList=new ArrayList<String>();
        aList.add("Mario");
        aList.add("Luigi");
        aList.add("Mario");
        aList.add("Toad");
        aList.add("Peach");
        
        for (String s : aList) {
            System.out.println(s);
        }
        Iterator i=aList.iterator();
        String str="";
        while (i.hasNext()){
            str= (String) i.next();
            if (str.equals("Luigi")) {
                i.remove();
                break;
            }
        }
        System.out.println("");
        
        for (String s : aList) {
            System.out.println(s);
        }
        
    }
    
}
