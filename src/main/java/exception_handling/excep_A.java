package exception_handling;
public class excep_A {
    public static void main(String[] args) {
       
        try{
            String s=null;
            int a=2;
            System.out.println("a");
            int b=2/0;
          System.out.println("b");
            int c=2/0;
            System.out.println("c");
            
        }catch(Exception q){
            System.out.println("Error : "+q);            
        }
        finally{
            System.out.println("Thank You");
        }
    }
}
