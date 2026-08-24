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
        
        
}

public class pruebaLinkedList {
  public static void main(String[] args) {
  LnkdLst lista = new LnkdLst();
  lista.add("luis", 65);
   lista.add("Ada", 65);
    lista.add("Paul", 65);
    }
      }
