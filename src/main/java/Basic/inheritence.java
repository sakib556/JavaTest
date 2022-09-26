
package Basic;

public class inheritence extends son {
    public static void main(String[] args) {
       inheritence i=new inheritence();
       int property1 =Property1;
       System.out.println("Father's Property : "+property1);
       i.son1();
       int property2 = Property2;
       property3=property1+property2;
       i.son2();
    }
 
}
class son extends father{
     static int property3,Property2;
   void son1(){
       System.out.println("This is method son1 of son class.");
       Property2 = 10;
       System.out.println("Only son's Property : "+Property2);
   }
   void son2(){       
       System.out.println("Father's property + Son's property = "+property3);
   }}
class father{  
    static int Property1 = 90; 
}
