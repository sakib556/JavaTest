package string_;
import java.util.Scanner;
public class Size_charAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Type name : ");
        String name = sc.nextLine();
        int size = name.length();
        System.out.println("The size of the name is : "+size);
        
        System.out.println("Type character number : ");
        int a=sc.nextInt();
        System.out.println("Character at "+a+" is : "+name.charAt(a));
    }
}
