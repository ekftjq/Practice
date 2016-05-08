package practice;

/**
 * Created by Moon on 5/8/2016.
 */
public class Node {
    int data;
    Node next;

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
     k = 3
     j
     start at d
     total is 9
     9 mod 3 = 0
     d g j
     e h k
     f t l

     a b c d e f g h i j k l
      */

    public Node findKthFromEnd(int k) {
        if(k <= 0) {
            return null;
        }
        int total = getTotal();
        int i = 0;
        Node n = this;
        Node[] nodes = new Node[k];
        while(n.next != null) {
            if(i == k) {
                i = 0;
            }
            //System.out.println(i);
            nodes[i] = n;
            i++;
            n = n.next;
        }
        int kth = (total % k);
        return nodes[kth];
    }

    private int getTotal() {
        int total = 1;
        Node n = this;
        while(n.next != null) {
            total++;
            n = n.next;
        }
        return total;
    }

    public Node booksol(Node head, int k) {
        if (k <= 0) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;

        for(int i = 0; i < k - 1; i++) {
            if(p2 == null) {
                return null;
            }
            p2 = p2.next;
        }

        if(p2 == null) {
            return null;
        }

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

}
