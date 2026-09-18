/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author vales
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int [3];


        array[0] = 7;
        array[1] = 8;
        array[2] = array[0]+array[1];
        
         int[] na = new int [5];
     
        for(int i = 0; i < 3; i++) {
            na[i] = array[i];

        }
    }
    
}
