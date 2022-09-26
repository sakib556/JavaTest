/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;
import java.util.Scanner;

public class scannerClass {
    public static void main (String[] args){
        scannerClass scan=new scannerClass();
        Scanner s=new Scanner(System.in);
       
        System.out.println("Type three values for a+b+c : ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();   
        scan.sum(a,b,c);
        scan.div(a, b);
    }
    void sum(int a,int b,int c){
        c=a+b+c;
        System.out.println("The summation is : "+c);
    }
    void div(int a,int b){
        a=a/b;
        System.out.println("The division is : "+a);
    }
}
