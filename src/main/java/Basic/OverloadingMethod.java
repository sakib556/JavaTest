/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

public class OverloadingMethod {
    public static void main(String[] args) {
        System.out.println("Method Overloading : ");
        OverloadingMethod obj=new OverloadingMethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("Type integer key and enter for the result : ");
        sc.nextInt();
        System.out.println(obj.same());
        System.out.println(obj.same(2));
        System.out.println(obj.same(2,1));
        System.out.println(obj.same(2,1,1));
    }
    
    int same(){
        System.out.println("This is Same Method 1");
        int x=1;
        return x ;
    }
    int same(int a){
        System.out.println("This is Same Method 2");
        return a ;
    }
    int same(int a,int b){
        System.out.println("This is Same Method 3");
        return a+b ;
    }
    int same(int a,int b,int c){
        System.out.println("This is same method 4");
        return a+b+c ;
    }
}
