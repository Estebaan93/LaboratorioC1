/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lenguajes2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Esteban
 */
public class Lenguajes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> aList=new ArrayList<>();
        aList.add("C++");
        aList.add("PSint");
        aList.add("C++");
        aList.add("SQL");
        aList.add("Java");
        for (String s: aList) {
            System.out.println(s);
        }
        System.out.println("");
        Iterator i=aList.iterator();
        String str="";
        while(i.hasNext()){
            str= (String) i.next();
            if (str.equals("PSint")) {
                aList.add("C++");
                break;
            }
        }
        for (String s : aList) {
            System.out.println(s);
        }
    }
    
}
