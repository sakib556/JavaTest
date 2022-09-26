package LinkedList;
import java.util.*;
public class L_ListA {
    public static void main(String[] args) {
        //LinkedList l=new List(); //list cannot be initiated;
        // List l=new List(); //list cannnot be initiated;

        //ArrayList l=new ArrayList(); //Some function cannot works in the same program.        
        //List l=new LinkedList(); //this also work with the same way.
        
        LinkedList l=new LinkedList();
        l.add(90);
        l.add("Sakib");
        l.add("Horain");
        l.add(90);
        l.add(90);
        l.add('a');
        l.add(true);
        System.out.println("Linked List 1 : "+l);
        l.add(2,"Index Two");
        System.out.println("Linked List 2 : "+l);
        l.addFirst("First Ind");
        System.out.println("Linked List 3 : "+l);
        l.addLast("last ind");
        System.out.println("Linked List 4 : "+l);
        String getInd =(String) l.get(0);
        System.out.println("Linked List get ind 0 : "+getInd);
        
        if(l.contains("First Id")==true){
            System.out.println("Value has found.");
        }
        else{
            System.out.println("Value has not found.");
        }
        int lastInd=l.lastIndexOf(90);
        System.out.println("Last index of 90 : "+lastInd);
         
        System.out.println("Pop : "+l.pop());
        System.out.println("Linked List 6 after pop : "+l);
        System.out.println("Peek : "+l.peek());
        System.out.println("Linked List 7 after peek : "+l);
        
        System.out.println("ToString : "+l.toString());
        System.out.println("Linked List 8 after string convert : "+l);
        
    }
  
}
