/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class excep_B {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
         try{
            System.out.println("Type input : ");
            int input=sc.nextInt();
            System.out.println(input);
            int a=2;
            System.out.println("a");
            int b=2/0;
            System.out.println("b");
            int c=2/0;
            System.out.println("c");
            
        }
        catch(ArithmeticException ar){
            System.out.println("Error : "+ar.getMessage());            
        }
        catch(Exception any){
            System.out.println("Error : "+any.getMessage());
        }
        finally{
            System.out.println("Thank You for stay with us.");
            
        }
        
    }
   
}
