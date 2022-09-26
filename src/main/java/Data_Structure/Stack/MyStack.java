package Data_Structure.Stack;

public class MyStack {
    int capacity = 3;
    int[] stack = new int[capacity];
    int top = -1;

    void push(int x) {
        if (top < capacity-1) {
            top = top + 1;
            stack[top] = x;
            System.out.println("pushed the number : " + stack[top]);
        } else {
            System.out.println("Exception : Limit is over. Pop some please before push.");
        }

    }

    int pop() {
        if(top<0)
        {   System.out.println("Exception : Stack underflow.");
            return -1;
        }
         top=top-1;
    return stack[top];

    }

    int peek() {
        if(top<0)
            {   System.out.println("Exception : Stack underflow.");
                return -1;
            }
        return stack[top];

    }

    public static void main(String[] args) {
        System.out.println("implementing my stack");
        MyStack stack = new MyStack();
        System.out.println("Top value is :"+stack.peek());
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println("Top value is :"+stack.peek());
        stack.pop();
        System.out.println("Top value is :"+stack.peek());
    }
}
