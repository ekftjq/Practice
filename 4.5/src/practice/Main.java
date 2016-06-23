package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree t = new Tree(6);
        t.root.addLeft(4);
        t.root.addRight(8);
        t.root.left.addLeft(1);
        t.root.left.addRight(5);
        t.root.right.addLeft(7);
        t.root.right.addRight(2);
        System.out.println(t.checkBST(t));
    }
}
