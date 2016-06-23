package practice;

/**
 * Created by Moon on 2016-06-13.
 */
public class Node {
    Node next;
    int data;

    public Node(int d) {
        data = d;
        next = null;
    }

    public void appendToEnd(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void appendNodeToEnd(Node end) {
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node findLoop(Node head) {
        Node shortstep = head;
        Node longstep = head;

        /*
        Error Checking
         */
        if(longstep.next == null || longstep.next.next == null) {
            return null;
        }

        while(longstep.next != null) {
            shortstep = shortstep.next;
            longstep = longstep.next.next;
            if(longstep == shortstep) {
                break;
            }
        }

        shortstep = head;
        while(longstep.next != null) {
            shortstep = shortstep.next;
            longstep = longstep.next;
            if(shortstep == longstep) {
                break;
            }
        }
        return shortstep;
    }

    public void printList(Node head) {
        Node n = head;
        //System.out.println(n.data);
        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
