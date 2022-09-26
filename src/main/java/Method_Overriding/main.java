/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method_Overriding;

public class main extends test{
    public static void main(String[] args) {
        main obj1=new main();
        test obj2=new test();
        obj1.method1();
        obj2.method1();
        obj1.test();
        obj2.test();
    }
   
    @Override
   void method1(){
        System.out.println("This is overriding method.");
}
    @Override
   void test(){
         System.out.println("This is override test method .");
     }
   
}