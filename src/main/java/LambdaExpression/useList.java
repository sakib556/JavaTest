/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

import java.util.*;

/**
 *
 * @author sakib
 */
public class useList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("String");
        list.add("String 2");
        
        list.forEach(
                (i)-> System.out.println(i)
                        );
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
    
}
