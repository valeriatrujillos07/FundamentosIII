/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

/**
 *
 * @author vales
 */
public class Rover {
     public static void main(String[] args) {
        String cadena = args.length > 0 ? args[0] : "path1.txt";
        ArrayList<String> lineas = leerArchivo(cadena);
        Queue<String> queue = addToQueue(lineas);
        traveQueue(queue);
        Deque<String> stack = queueToStack(queue);
    }
     public static ArrayList<String> leerArchivo(String nombreArchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }
    public  static void traveQueue(Queue<String> queue) {
    while(!queue.isEmpty()){
    String linea = queue.poll();
    if(linea != null){
          linea = linea.trim().toUpperCase();
    if(linea.toUpperCase().equals("A")){
    System.out.print("^");
    }else if(linea.toUpperCase().equals("D")){ 
        System.out.print("V");
    
    }else if(linea.toUpperCase().equals("S")){ 
    System.out.print("-");
    }
    }
    }
    System.out.println();
    }
    public static Deque<String> queueToStack(Queue<String> queue){ 
        Deque<String> deque =  new ArrayDeque<>();
        while(!queue.isEmpty()){ 
        String linea = queue.poll();
        if(linea != null){  
        deque.push(linea);
        }
        }
         return deque;
    
    }
    

    
    
    public static Queue<String> addToQueue(ArrayList<String> lineas) {
    Queue<String> queue = new java.util.LinkedList<>();
    for(String linea : lineas){
    queue.add(linea);
    }
    
    
    return queue;
    }
    
    
}
