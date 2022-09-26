/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import java.util.ArrayList;

/**
 *
 * @author sakib
 */
public class MainClass {
    public static void main(String[] args) {
        SubClass s=new SubClass();
        s.method1(0);
        s.show();
        s.showNew();
    }
    void showArray(){
        ArrayList<String>al=new ArrayList<>();
        al.add("Sakib");
        al.add("Rafiq");
        System.out.println("Arraylist 1 : "+al);
     //   al.add(4); //this is error
    }
    
    @SuppressWarnings("unchecked")
    void showArray2(){
        ArrayList al2=new ArrayList();
        al2.add("Sakib");
        al2.add(8);
        System.out.println("Arraylist 2 : "+al2);
    }
    @Deprecated
    void show(){
        System.out.println("This is not available");
    }
    void showNew(){
        System.out.println("This is available");
    }
    void method1(int a){
       System.out.println("This is method1");
}
}
