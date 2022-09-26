/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

/**
 *
 * @author sakib
 */

public class MainClass {
    public static void main(String[] args) {
//        Drawable da=new Drawable(){
//          @Override
//          public void show(int x){
//              System.out.println("The goal is "+x);
//          }  
//        };
        Drawable da=(y)->{
              System.out.println("The goal is "+y);
          } ; 
        da.show(4);
    }
}

