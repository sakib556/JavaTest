package block_test;
public class blocktest {
    public static void main(String[] args) {
       blocktest b=new blocktest();
       b.method1();
   
    } 
   void method1(){
       System.out.println("This is method");    
   }
   blocktest(){
       System.out.println("This is constructor");
   }
{
       System.out.println("This is the block");
       
   }
   {
       System.out.println("This is the block2");
       
   }
   static{
       System.out.println("This is the static block");
       
   }
}
