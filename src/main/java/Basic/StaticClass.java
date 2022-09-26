package Basic;
public class StaticClass {
    static int a;
    public static void main(String[] args) {
     a=10;
     StaticClass ob=new StaticClass();
     System.out.println("Method main : a = "+a); 
     ob.Method_1();
     ob.Method_2();
   }
   void Method_1(){
        a=a+10;    
        System.out.println("method_1 -- a= a+10 = "+a);   
    }
   void Method_2(){
        a=a+10;    
        System.out.println("method_2 -- a= a+10 = "+a);   
    }  
}