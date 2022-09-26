package InnerClass;
public class MainClass {
    public static void main(String[] args) {
       MainClass m = new MainClass();
       method1();
       MainClass.subClass s=m.new subClass();
       s.method1();
       s.method2();
       MainClass.subClass.ThirdClass t=s.new ThirdClass();
       t.method1();
    }
    static void method1(){
        System.out.println("This is method 1 of Main Clas");
    }    
   class subClass{
       void method1(){
           System.out.println("This is method 1 of SubClass");   
       }
       void method2(){
           System.out.println("Method 2 of subclass.");
       }   
   class ThirdClass{
       void method1(){
           System.out.println("Method 1 in Third Class in Sub class .");
       }
   }
   }
}
