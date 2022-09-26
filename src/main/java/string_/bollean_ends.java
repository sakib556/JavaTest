package string_;

import java.util.Scanner;
public class bollean_ends {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Type the name : ");
         String name = sc.nextLine();
         System.out.println("Type the last letter : ");
        String name2 = sc.nextLine();
        
        boolean ends=name.endsWith(name2);
        System.out.println(ends);
        
        if(ends==true){
            System.out.println("This is true. The name ends with the letter - "+name2);
        }
        else{
            System.out.println("This is false.");
        }
    }
}
