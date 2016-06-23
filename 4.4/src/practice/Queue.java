package practice;

/**
 * Created by Moon on 2016-06-22.
 */
public class Queue {
    Node first;
    Node last;

    public Queue() {
        first = null;
        last = null;
    }

    public void enqueue(Tree t) {
        if(first == null) {
            last = new Node(t);
            first = last;
            //System.out.println("enqueue");
        }
        else {
            last.next = new Node(t);
            last = last.next;
        }
    }

    public Tree dequeue() {
        if(last == null) {
            return null;
        }
        Tree t = first.item;
        first = first.next;
        return t;
    }

    public boolean isEmpty() {
        if(first == null) {
            return true;
        }
        return false;
    }
}
