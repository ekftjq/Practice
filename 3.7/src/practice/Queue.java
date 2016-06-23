package practice;

/**
 * Created by Moon on 2016-06-19.
 */
public class Queue {
    Node first;
    Node last;

    public void enqueue(boolean dog) {
        Node item = new Node(dog);
        if(first == null) {
            first = item;
            last = first;
        }
        else {
            last.next = item;
            last = item;
        }
    }

    /*
    dog cat cat cat cat
    */

    public String dequeueDog() {
        if(first == null) {
            return "empty";
        }
        if(first.dog) {
            first = first.next;
            return "Successfully dequeued Dog";
        }
        else {
            Node a = first;
            while(first.next != null && !first.next.dog) {
                first = first.next;
            }
            first.next = first.next.next;
            first = a;
            return "dequeued dog";
        }
    }

    public String dequeueCat() {
        if(first == null) {
            return "empty";
        }
        if(!first.dog) {
            first = first.next;
            return "Successfully dequeued Cat";
        }
        else {
            Node a = first;
            while(first.next != null && first.next.dog) {
                first = first.next;
            }
            first.next = first.next.next;
            first = a;
            return "dequeued cat";
        }
    }

    public String dequeue() {
        if(first == null) {
            return "emtpy";
        }
        if(first.dog) {
            first = first.next;
            return "Successfully dequeued dog from all";
        }
        else {
            first = first.next;
            return "Successfully dequeued cat from all";
        }
    }
}
