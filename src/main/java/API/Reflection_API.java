/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sakib
 */
public class Reflection_API {
   @SuppressWarnings("Unchecked")
    public static void main(String[] args) {
        try {
            TestClass tc=new TestClass();
            //tc.showPb();
            tc.showPb();
            //   tc.showPr(); this should not run because of private method.
            Class cl= Class.forName("API.TestClass");
            TestClass tc2=(TestClass) cl.newInstance();
            Method meth=cl.getDeclaredMethod("showPr",null);
            meth.setAccessible(true);
           meth.invoke(tc2, null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) { 
           Logger.getLogger(Reflection_API.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }
}
