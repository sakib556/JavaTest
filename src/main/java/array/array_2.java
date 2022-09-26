/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class array_2 {
       public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
      
       System.out.print("Enter array size : ");
       int arr[] = new int [s.nextInt()];
       
       for(int x=0;x<arr.length;x++){
            System.out.print("Enter index "+x+" = ");
            arr[x]=s.nextInt();
        }      
      
       System.out.println("Last Input - First Output (LIFO) : ");
       for(int x=arr.length;x>0;){
            x--;
            System.out.println("Index "+x+" = "+arr[x]);
           
        }  
    }
}
