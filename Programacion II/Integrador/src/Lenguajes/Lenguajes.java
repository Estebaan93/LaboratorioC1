/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lenguajes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Lenguajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> aList=new ArrayList<String>();
        aList.add("Java");
        aList.add("PSint");
        aList.add("Java");
        aList.add("SQL");
        aList.add("HTML");
        for (String s : aList) {
            System.out.println(s);
        }
        System.out.println("");
        Iterator i=aList.iterator();
        String str="";
        while(i.hasNext()){
            str= (String) i.next();
            if (str.equals("PSint")) {
                i.remove();
                break;
            }
        }
        for (String s : aList) {
            System.out.println(s);
        }
    }
    
}
