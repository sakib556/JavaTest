/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author user
 */
public class AnnonymousInner {
    public static void main(String[] args) {
        AnnonymousInner ann=new AnnonymousInner();
        ann.t.method2();
    }
    TestClass t=new TestClass(){
        @Override
        void method2(){
            System.out.println("Hello in main & Annonymus");
        }
    }; 
}
abstract class TestClass{
    void method1(){
        System.out.println("Method1 in TestClass");
    }
    abstract void method2();
}
