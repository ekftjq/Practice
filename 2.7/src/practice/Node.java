package practice;

import java.util.ArrayList;

/**
 * Created by Moon on 2016-06-13.
 */
public class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void appendToEnd(int data) {
        Node end = new Node(data);
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

    public boolean checkPanlindrome(Node head) {
        ArrayList<Integer> LinkedListNodes = new ArrayList<>();
        Node n = head;
        while(n.next != null) {
            LinkedListNodes.add(n.data);
            n = n.next;
        }
        LinkedListNodes.add(n.data);

        int size = LinkedListNodes.size();
        for(int i = 0; i < size/2; i++) {
            if(LinkedListNodes.get(i) != LinkedListNodes.get(size-1-i)) {
                return false;
            }
        }
        return true;
    }
}
