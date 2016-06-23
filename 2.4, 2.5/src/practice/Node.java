package practice;

import java.util.ArrayList;

/**
 * Created by Moon on 2016-06-06.
 */
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void appendToEnd(int data) {
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = new Node(data);
    }

    /*
    p = 5
    j = 3
    i = 2

    6 3 2 5
            6 0 2
    3 2 0 2 5 6 6


           */

    public Node partitionList(int x) {
        ArrayList<Integer> lower = new ArrayList<>();
        ArrayList<Integer> higher = new ArrayList<>();
        int same = 0;
        Node n = this;
        while(n != null) {
            if (n.data < x) {
                lower.add(n.data);
                //System.out.println(n.data);
                n = n.next;
            }
            else if (n.data > x) {
                higher.add(n.data);
                //System.out.println("high :" + n.data);
                n = n.next;
            }
            else if (n.data == x) {
                same++;
                n = n.next;
            }
        }
        Node result = new Node(lower.get(0));
        Node start = result;
        for(int i = 1; i < lower.size(); i++) {
            result.next = new Node(lower.get(i));
            //System.out.println(lower.get(i));
            result = result.next;
        }
        result.next = new Node(x);
        result = result.next;
        while(same > 1) {
            result.next = new Node(x);
            result = result.next;
            same--;
        }
        for(int j = 0; j < higher.size(); j++) {
            result.next = new Node(higher.get(j));
            result = result.next;
        }
        return start;

    }

    public void printList() {
        Node n = this;
        while(n.next != null) {
            System.out.print(n.data + ",");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public Node partitionBooksol(Node node, int x) {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        while(node != null) {
            Node next = node.next;
            node.next = null;
            if(node.data < x) {
                if(beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }

        if(beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }





}
