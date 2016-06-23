package practice;

/**
 * Created by Moon on 2016-06-16.
 */
public class Stack {
    Node top;

    public void push(Object data) {
        Node t = new Node(data);
        t.next = top;
        top = t;
    }

    public Object pop() {
        if(top == null) {
            System.out.println("Cannot pop. Top is null");
            return null;
        }
        else {
            Object result = top.data;
            top = top.next;
            return result;
        }
    }

    public Object peek() {
        if(top == null) {
            System.out.println("Top is null");
            return null;
        }
        return top.data;
    }

}
