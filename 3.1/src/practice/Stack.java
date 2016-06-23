package practice;

/**
 * Created by Moon on 2016-06-14.
 */
public class Stack {
    Node top;

    public Integer pop() {
        if(top != null) {
            Integer item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    public void push(int item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }

    public Integer peek() {
        if(top == null) {
            return null;
        }
        else return top.data;
    }

    /*
    62
    556
    43
    1311
     */

    public int findMin() {
        Stack s = this;
        int min = s.peek();
        while(s.pop() != null && s.peek() != null) {
            if(s.peek() < min) {
                min = s.peek();
            }
        }
        return min;
    }

}
