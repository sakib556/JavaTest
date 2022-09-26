package Basic;
public class Math_class {
    public static void main(String[] args) {
        Math_class obj=new Math_class();
        obj.Mathematics();
    }  
void Mathematics(){
      int a=15,b=5,sum,sub,mul,div;
       sum=a+b;
       sub=a-b;
       mul=a*b;
       div=a/b;       
       System.out.println("The value of a,b = "+a+(",")+b);
       System.out.println("The summation of a+b = "+sum);
       System.out.println("The substraction of a-b = "+sub);
       System.out.print("The multiplication of a*b = "+mul);
       System.out.print("\nThe division of a/b = "+div);
}
}