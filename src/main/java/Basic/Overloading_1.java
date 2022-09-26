/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author sakib
 */
public class Overloading_1 {
    Overloading_1(){
        System.out.println("constructor 1");
        
    }
    Overloading_1(int a){
        
        
    }
    void student1(){
        System.out.println("This is student 1 method");
    }
    void student1(int a){
        System.out.println("This is student 2 method");
    }
    void student1(int a,String b){
        System.out.println("This is student 3 method");
    }
    void student1(String b,int a){
        System.out.println("This is student 4 method");
    }
    
    
    
   
    public static void main(String[] args) {
        Overloading_1 ob=new Overloading_1();
        ob.student1(1,"j");
        
    }
}
