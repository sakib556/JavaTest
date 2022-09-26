package WrapperClass;
public class ClassA {
    public static void main(String[] args) {
     ClassA a=new ClassA();
       //a.method1();
       a.method2();
    }
    void method2(){
        
        
        
    }
    void method1(){
           //Integer to integer and double
            Integer i = new Integer("19");
            int a=i;
            System.out.println("Integer to integer a = "+a);
            double b=i;
            System.out.println("Integer to Double b = "+b);
        //String to int     
            String str = "19";
            Integer num1 = new Integer(str);         
            int sum=num1+1;
            System.out.println("String to int : "+sum);
        //String to int     Shortcut 1   
            String str2 = "19";
            int num2 = Integer.parseInt(str2);
            int sum2 = num2+1;
            System.out.println("String to int sum2 = "+sum2);
        //String to int    Shortcut 2   
            String str3 = "19";
            int num3 = Integer.valueOf(str3);
            int sum3 = num3+1;
            System.out.println("String to int sum3 = "+sum3);
                    
        //Integer to float    
            int int1 = 10;
            float num5 = new Float(int1);
            float sum5=num5+3.5555635f;
            System.out.println("int to float sum5= "+sum5);
        //Integer to float Shortcut 1   
            int int2 = 10;
            float num4 = Float.valueOf(int2);
            float sum4=num4+3.5555635f;
            System.out.println("int to float sum4= "+sum4);
        //float to Integer  Shortcut 1
            Float float1 = 3.4556f;
            Float num7=new Float (float1);
            int num6=num7.intValue();
            System.out.println("float to int num6 = "+num6);
            
         //float to Integer  Shortcut 1
         Float num9=new Float (5);
         double num8=num9.doubleValue();
         System.out.println("float to double num6 = "+num8);  
    }
}
