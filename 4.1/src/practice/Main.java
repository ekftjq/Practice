package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node tree = new Node(1);
        tree.addleft(2);
        tree.addright(3);
        tree.left.addleft(2);
        tree.left.addright(2);
        tree.left.left.addleft(3);
        tree.left.left.addright(3);
        tree.left.right.addleft(3);
        tree.left.right.addright(3);
        /*
        tree.left.left.addright(3);
        */
        System.out.println(tree.isBalanced(tree));
    }
}
