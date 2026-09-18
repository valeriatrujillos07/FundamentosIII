/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

class nameCount {
       String name;
       int count;
       
       public nameCount(String name){
      this.name = name;
      this.count = 1;
      
     
    }
        public void incrementCount(){
    this.count++;
    }
           public String getName(){
               return this.name + "(" + this.count + ")";
  }
     
    
          }
/**
 *
 * @author vales
 */
public class NombresArrayList {
    
    public static void main(String[] args) {
        int FIRSTNAME = 0;
        int LASTNAME  = 1;
        int LASTLASNAME = 2;
        
     Path filePath = Paths.get("C:\\Users\\vales\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\listado.txt");  
     ArrayList <String> nameList = readNamesFromFile(filePath.toString());
 
     ArrayList<String> repetidos = new ArrayList();
     


 ArrayList<String> countedNames = countNames(nameList, FIRSTNAME);

 printNames(countedNames);
             
    }
    public static void printNames(ArrayList<String> nameList) {
        for(String name : nameList ){
            System.out.println(name);
    }
        
  
    }
    

    public static ArrayList<String> readNamesFromFile(String filePath){
       ArrayList<String> names = new ArrayList();
       ArrayList<Integer> cantidades = new ArrayList<>();
       try {
    Stream<String> lines = Files.lines(Paths.get(filePath)); 
    for(String line : (Iterable<String>) lines::iterator ){
        
    names.add(line);
    }
    lines.close();
    
    }catch(IOException e){
        e.printStackTrace();
    
    }
     return names;  
    };
    
     public static ArrayList<String> countNames(ArrayList<String> names, int pos) {
        ArrayList<nameCount> countedNames = new ArrayList<>();
       // int pos = 1; 
        for (String name : names) {
            String[] splitName = name.split(" ");
            boolean found = false;
            for (nameCount nc : countedNames) {
                if (nc.name.equals(splitName[pos])) {
                    nc.incrementCount();
                    found = true;
                    break;  
                }
            }
            if (!found) {
                countedNames.add(new nameCount(splitName[pos]));
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (nameCount nc : countedNames) {
            result.add(nc.getName());
        }
        return result;
    }

   
}
