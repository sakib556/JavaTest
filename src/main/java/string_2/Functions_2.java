package string_2;
import java.util.Scanner;
public class Functions_2 {
Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Functions_2 ob=new Functions_2();
       // ob.join();
       ob.splite();
       
    }
 void join(){
    String d,m,y;
    System.out.println("Type Date : ");
    d=sc.next();
    System.out.println("Type Month : ");
    m=sc.next();
    System.out.println("Type Year : ");
    y=sc.next();
    
    String time = String.join("/",d,m,y);
    System.out.println("The time is : "+time);
 }    
 void splite(){
     System.out.println("Name : ");
     String s = "Bd and Tiger";
     String[] splite=s.split("and");
     System.out.println("Spliting \"and\" with arr[1]  : "+splite[1]);
     
     String substring=s.substring(2);
     System.out.println("After 3 step the name is : "+substring);
     String substring2=s.substring(2,6);
     System.out.println("After 3 step / 5 step  the name is : "+substring2);
     
     String s2 = "               Space           2Space ";
     String trim = s2.trim();
     System.out.println("Trim : "+trim);
     
     
 }
}
