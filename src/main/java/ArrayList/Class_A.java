package ArrayList;
import java.util.ArrayList;
public class Class_A {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(90);
        arr.add("Sakib");
        arr.add("Horain");
        arr.add(90.3);
        arr.add(90.9999);
        arr.add('a');
        arr.add(true);
        System.out.println("Array List : "+arr);
        System.out.println("Array Size : "+arr.size());
        System.out.println("Array get index 2 : "+arr.get(2));
        
        arr.add(2,"TwoIndex");
        System.out.println("Update Array index 2 to TwoIndex : "+arr);
        arr.set(3,"ThreeIndex");
        System.out.println("remove the index 3 and Update Array index 3 to ThreeIndex : "+arr);
        
        arr.remove(3);
        System.out.println("Array List remove index three : "+arr);
        arr.remove("Sakib");
        System.out.println("Array List remove Sakib : "+arr);
        
        arr.removeAll(arr);
        System.out.println("Array List Remove : "+arr);
        arr.clear();
        System.out.println("or Array List clear : "+arr);
      
    }
    
}
