package Data_Structure.Stack;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("bangla");
        myStack.push("english");
        System.out.println("index 0 :"+myStack.elementAt(0));
        System.out.println("pop : "+myStack.pop());
        System.out.println("peek : "+myStack.peek());
    }
}
