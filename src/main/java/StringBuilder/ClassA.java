/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder;

/**
 *
 * @author sakib
 */
public class ClassA {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kazi ");
        sb.append("Sakib");
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
        sb.replace(0, 2, "K");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.indexOf("K"));
        sb.insert(7," Kazi Shakib");
        System.out.println(sb);
    }
}
