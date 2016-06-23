package practice;

/**
 * Created by Moon on 2016-06-15.
 */
public class Queue {
    Node first;
    Node last;

    public void enqueue(Integer item) {
        Node t = new Node(item);
        if (first == null) {
            last = t;
            first = last;
        } else {
            last.next = t;
            last = last.next;
        }
    }

    public Object dequeue() {
        if(first != null) {
            Node t = first;
            first.next = first;
            return t.data;
        }
        return null;
    }


}
