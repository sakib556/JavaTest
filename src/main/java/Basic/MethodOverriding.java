/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author user
 */
public class MethodOverriding extends test{
    public static void main(String[] args) {
        MethodOverriding m=new MethodOverriding();
        m.method1();
    }
    @Override
   void method1(){
        System.out.println("This is overriding method.");
}
}