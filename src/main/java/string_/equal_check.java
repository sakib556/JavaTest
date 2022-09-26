/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_;

public class equal_check {
      public static void main(String[] args) {
        String name = "Niloy Ahmed";
        System.out.println(name);
        String name2 = "Niloy Ahmed";
        System.out.println(name2);
        
        boolean equals=name.equals(name2);
        System.out.println(equals);
        
        if(equals==true){
            System.out.println("This is equal.");
        }
        else{
            System.out.println("This is not matching.");
        }
    
}
}
