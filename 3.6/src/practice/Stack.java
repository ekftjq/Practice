package practice;

import java.util.EmptyStackException;

/**
 * Created by Moon on 2016-06-19.
 */
public class Stack {
    Node top;
    int size = 0;

    public Stack() {

    }

    public void push(int data) {
        Node item = new Node(data);
        item.next = top;
        top = item;
        size++;
    }

    public int pop() {
        int item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public int peek() {
        return top.data;
    }

    public boolean isEmpty() {
        if(size <= 0) {
            return true;
        }
        return false;
    }

    /*


    temp = 1

        9
        7
        2
        1
    8   0


     */

    public Stack sort(Stack s) {
        Stack buffer = new Stack();
        //System.out.println("value:" + s.top.data);
        //buffer.push(s.pop());
        while(!s.isEmpty()) {
            int temp = s.pop();
            while(!buffer.isEmpty() && temp < buffer.peek()) {
                s.push(buffer.pop());
            }
            buffer.push(temp);
        }
        return buffer;
    }

    public void printStack() {
        Node a = this.top;
        while(top != null) {
            System.out.println(this.peek());
            top = top.next;
        }
        top = a;
    }

}
