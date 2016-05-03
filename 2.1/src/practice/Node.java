package practice;

import java.util.Hashtable;

/**
 * Created by Moon on 5/3/2016.
 */
public class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void removeDuplicates() {
        Node n = this;
        Node n2;
        while (n.next != null) {
            n2 = n.next;
            while(n2.next != null) {
                if (n.next.data == n2.next.data) {
                    //System.out.println(n.data);
                    //System.out.println(n2.data);
                    n.next = n.next.next;
                }
                //System.out.println(n.data);
                //System.out.println(n2.data);
                n2 = n2.next;
            }
            //System.out.println(n.data);
            n = n.next;
        }
    }

    public void removeDupbooksolution(Node n) {
        Hashtable table = new Hashtable();
        Node prev = null;
        while (n != null) {
            if(table.contains(n.data)) {
                prev.next = n.next;
            }
            else {
                table.put(n.data, true);
                prev = n;
            }
            n = n.next;
        }
    }

    Node deleteNode(Node head, int d) {
        Node n = head;

        if(n.data == d) {
            return head.next;
        }

        while(n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
