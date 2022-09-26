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
public enum NewEnum {
    red(1),yellow(2),green(3),blue(4);
    public static void main(String[] args) {
   for(NewEnum n:NewEnum.values() ){
        System.out.println("Colour : "+n+" Value : "+n.val);
    }
   NewEnum n=NewEnum.red;
        System.out.println("Colour : "+n+" Value : "+n.val);
    }
    //use constructor 
    
    private int val;
    private NewEnum(int val){
        this.val=val;
    }
    
    }

