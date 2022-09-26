package InnerClass;

class A{
 public void method_1(){
     System.out.println("Method 1 in class A.");
}}
//class B extends A{
// @Override
// public void method_1(){
//     System.out.println("Override: Method 1 in class A.");
//}
//}
public class Class_Main {
    public static void main(String[] args) {
        System.out.println("Main method in  Class Main");    
         A b=new A(){
         @Override
         public void method_1(){
             System.out.println("Override : Method 1 in class A.");
         }
    };
    
//    B obj = new B();
//    obj.method_1();
    }
}
   
     
    

