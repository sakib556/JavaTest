/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPack;

/**
 *
 * @author user
 */
public class MainClass  {
    public static void main(String[] args) {
        Class_B s = new Class_B();
        s.aMethod();
       // int a=s.pri; erorr
       int b= s.pub;
       int c=s.def;
       int d=s.prot;        
    }
}
