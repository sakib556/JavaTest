/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;
import java.lang.annotation.*;

/**
 *
 * @author sakib
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface myAnno{
    int val() default 20;
    String str();
}
@myAnno(val=30,str="Sakib")
public class AnnoTest2 {
    void show(){
        System.out.println("This is show .");
    }
    public static void main(String[] args) {
        AnnoTest2 at=new AnnoTest2();
        at.show();
        Class ca=at.getClass();
        Annotation an=ca.getAnnotation(myAnno.class);
        myAnno ma=(myAnno) an;
        System.out.println("Value is : "+ma.val());
        System.out.println("String is : "+ma.str());
    }
}
