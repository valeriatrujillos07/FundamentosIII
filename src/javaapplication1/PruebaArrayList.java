/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author vales
 */
public class PruebaArrayList {
    
     public static void main(String[] args) {
        ArrayList <String> personalities = new ArrayList<String>();
        
        personalities.add("Ada");
          personalities.add("alan");
            personalities.add("grace");
            
            String name = personalities.get(1);
            System.out.println(name);
            System.out.println("The size of the array list is:" + personalities.size());
            
            personalities.set(1, "Marget");
            System.out.println(personalities);
              
    }
 
    
}
