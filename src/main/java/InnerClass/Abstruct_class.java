/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;
abstract class Ab {
    abstract void method_ab1();
}
public class Abstruct_class {
    public static void main(String[] args) {
        Ab obj=new Ab(){
            @Override
            void method_ab1(){
                System.out.println("Override method");
            }
        };
    }
    
    
    
}

