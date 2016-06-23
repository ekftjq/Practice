package practice;

/**
 * Created by Moon on 2016-06-22.
 */
public class Node {
    Node next;
    int data;
    Tree item;
    Node left;
    Node right;

    public Node(Tree item) {
        this.item = item;
        next = null;
    }

    public Node(int data) {
        this.data = data;
        next = null;
        left = null;
        right = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void addleft(int data) {
        Node item = new Node(data);
        this.left = item;
    }

    public void addright(int data) {
        Node item = new Node(data);
        this.right = item;
    }
}
