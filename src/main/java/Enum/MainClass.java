/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author sakib
 */
enum colour2 {blue,black,jam}
public class MainClass {
      enum colour {red,green}
    public static void main(String[] args) {
      colour c=colour.green;
        System.out.println("Colour : "+c);
      
      //use loop
      for(colour2 c2:colour2.values()){
          System.out.println("Colour : "+c2);
      }
      
                }
}
