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
        while(current.next != null){ 
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
        
        
        
}

public class pruebaLinkedList {
  public static void main(String[] args) {
  LnkdLst lista = new LnkdLst();
  lista.add("luis", 65);
   lista.add("Ada", 65);
    lista.add("Paul", 65);
    System.out.println();
    lista.print();
    Student found = lista.retrieve("Ada");
    System.out.println("Found " + found.name + "Score " + found.score);
    found = lista.retrieve("Guido");
    if(found != null){
    System.out.println("Found " + found.name + "Score" + found.score);
    }
    }
      }
