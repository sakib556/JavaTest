/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

/**
 *
 * @author sakib
 */
@FunctionalInterface
    interface ab{
    void aOne();    
  //  void aTwo(); // if it active ,than warning by FunctionalInterface.   
    }
@interface cd{
    String name() default "Sakib";
    int a() default 10;
}
@cd(a=3,name="k") //custom annotation
public class CustomeInterface {
    
}
