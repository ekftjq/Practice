package practice;

/**
 * Created by Moon on 2016-06-22.
 */
public class Node {
    Node left;
    Node right;
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
        next = null;
    }

    public void addLeft(int data) {
        this.left = new Node(data);
    }

    public void addRight(int data) {
        this.right = new Node(data);
    }
}
