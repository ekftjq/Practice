package practice;

/**
 * Created by Moon on 2016-06-22.
 */
public class Tree {
    Node root;

    public Tree(int data) {
        root = new Node(data);
    }

    public boolean checkBST(Tree t) {
        return checkBSThelper(t.root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private boolean checkBSThelper(Node t, int min, int max) {
        if(t == null) {
            return true;
        }
        if(t.data < min) {
            return false;
        }
        if(t.data > max) {
            return false;
        }
        if(!checkBSThelper(t.left, min, t.data) || !checkBSThelper(t.right, t.data, max)) {
            return false;
        }

        return true;
    }
}
