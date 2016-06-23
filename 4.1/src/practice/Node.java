package practice;

/**
 * Created by Moon on 2016-06-19.
 */
public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void addleft(int data) {
        left = new Node(data);
    }

    public void addright(int data) {
        right = new Node(data);
    }

    public int calcHeight(Node n) {
        if(n == null) {
            return 0;
        }
        return Math.max(1 + calcHeight(n.left), 1 + calcHeight(n.right));
    }

    public boolean isBalanced(Node n) {
        if(n == null) {
            return true;
        }
        if(Math.abs(calcHeight(n.left) - calcHeight(n.right)) < 2) {
            return true;
        }
        else return false;
    }

}
