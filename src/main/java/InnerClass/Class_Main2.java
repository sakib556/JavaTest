/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;
interface interfacing{
 void method_1();
}
//class interfacor implements interfacing{
// @Override
// public void method_1(){
//     System.out.println("Override: Method 1.");
//}
//}
public class Class_Main2 {
    public static void main(String[] args) {
        System.out.println("Main method in  Class Main");    
         interfacing intf=new interfacing(){
         @Override
         public void method_1(){
             System.out.println("Override : Method 1 in class A.");
         }
    };
         intf.method_1();
    
//    interfacor obj = new interfacor();
//    obj.method_1();
    }
}
   