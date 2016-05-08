package practice;

/**
 * Created by Moon on 5/8/2016.
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

    /*
        n
    a b c d e f g
     */

    public void deleteNode(Node n) {
        //System.out.println(n.data);
        n.data = n.next.data;
        n.next = n.next.next;
        //System.out.println(n.data);
        //n.next = n.next.next;
        //n.next = new Node(n.next.next.data);
    }
}
