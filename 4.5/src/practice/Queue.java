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

    public void enqueue(Node item) {
        if(first == null) {
            first = item;
            last = first;
        } else {
            last.next = item;
            last = item;
        }
    }

    public Node dequeue() {
        if(first == null) {
            return null;
        }

            Node n = first;
            first = first.next;
            return n;

    }

    public boolean isEmpty() {
        if(first == null) {
            return true;
        }
        return false;
    }
}
