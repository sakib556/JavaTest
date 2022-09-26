package string_;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Type the first name and then put a space : ");
        String name = sc.nextLine();
        System.out.println("Type the last name : ");
        String name2 = sc.nextLine();
        String concating=name.concat(name2);

        System.out.println("Full name : "+concating);
    }
}
