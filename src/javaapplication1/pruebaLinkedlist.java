/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author vales
 */
class Student{
    String name;
    int score;
    Student next;
    
    public Student(String name, int score){
        this.name = name;
        this.score = score;
        this.next = null;
        
    
    
}
    
}

   class LnkdLst{
        Student head;
        int index = 0;
        
        public LnkdLst(){
        this.head = null;
        }
        
        public void add(String name, int score){
        Student newStudent = new Student(name, score);
        if(head == null){
        head = newStudent;
        return;
        }
         Student current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newStudent;
        }
        
        public void print(){
        Student current = this.head;
        while(current != null){ 
        System.out.println(current.name + "-" + current.score);
        current = current.next;
        }
        
        }
        
        public Student retrieve(String searchName){ 
            Student current = this.head;
            while (current.next != null) {
            if(current.name.equals(searchName))
            {    return current; }
             current = current.next;
        }
            return null;

        }
        
        public void remove(int n){  
            Student current = this.head;
        if(current == null || n < 0  ){
            
             return;   
        }  
            int index = 0;
            
            while(current !=null  && index < (n-1) ){  
            current = current.next;
            index++;
            }
            if(current == null || current.next == null  ){ 
                return;
        }
            if (n >= this.index){ 
                return;
        }
            current.next = current.next.next;
            this.index--;
        }
        
        
        
}


  

public class pruebaLinkedList {
  public static void main(String[] args) {
  LnkdLst lista = new LnkdLst();
  lista.add("luis", 65);
  lista.add("Ada", 65);
  lista.add("Valeria", 99);
  System.out.println("Agregados");
  lista.print();
  Student found = lista.retrieve("Ada");
    System.out.println("Found " + found.name + "Score " + found.score);
    found = lista.retrieve("Guido");
    
    
    if(found != null){
    System.out.println("Found " + found.name + "Score" + found.score);
   

    }
     
    lista.remove(2);
    lista.print();
    
    }
  
      }
