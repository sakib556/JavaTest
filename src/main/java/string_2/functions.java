package string_2;
import java.util.Scanner;
public class functions {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      functions f = new functions();
    //f.indexOf();
    // f.contains();
    // f.IgnoreCase();
    }
    void contains(){        
        System.out.println("Type a name : ");
        String s=sc.nextLine();
        System.out.println("Type a character : ");
        String c=sc.nextLine();
        
        boolean check=s.contains(c);
       if(check==true){
           System.out.println("Congrates. This character is matching .");
       }
       else{
           System.out.println("Sorry this is not matching.");
       }
    }
    void IgnoreCase(){
              System.out.println("Type a name : ");
        String s=sc.nextLine();
        System.out.println("Type the same name without case sensitivity : ");
        String c=sc.nextLine();
        
        boolean check=s.contains(c);
       if(check==true){
           System.out.println("Congrates. This name is matching .");
       }
       else{
           System.out.println("Sorry this is not matching.");
       } 
    }
    void indexOf(){
                String s= "Saaaakib";
        System.out.println("Name : "+s);
        System.out.println("Type any character of the name : ");
        String s2=sc.nextLine();
       
        int i=s.indexOf(s2);
        System.out.println("Index of the character is : "+i);
        int i2=s.lastIndexOf(s2);
        System.out.println("From last , index of the character is : "+i2);
        int i3=s.indexOf(s2,2);
        
        String intern=s.intern();
        System.out.println("Copy the name with intern : "+intern);
        
        if(intern.isEmpty()){
            System.out.println("String is Empty");
        }
        else{
            System.out.println("String is not empty.");
    }
}
}