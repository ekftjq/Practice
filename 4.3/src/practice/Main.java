package practice;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node a = new Node(0);
        a = a.makeBST(array);
        a.print(a);
        //Node b= new Node(0);
        //b = b.createMinimalBST(array);
        //b.print(b);
	// write your code here
    }
}
