package practice;

import java.util.ArrayList;

/**
 * Created by Moon on 2016-06-15.
 */
public class Stack {
    Node top;
    int capacity;
    boolean full;
    int count = 0;

    public Stack() {

    }

    public Stack(int capacity) {
        this.capacity = capacity;
        full = isFull();
    }

    public void push(int data) {
        Node t = new Node(data);
        t.next = top;
        top = t;
        count++;
        full = isFull();
    }

    public Object pop() {
        if(top != null) {
            Node t = top;
            top = top.next;
            count--;
            full = isFull();
            return t.data;
        }
        return null;
    }

    public Object peek() {
        return top.data;
    }

    public boolean isFull() {
        if(count == capacity) {
            return true;
        }
        return false;
    }



}
