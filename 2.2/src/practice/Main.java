package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = new Node(1);
        head.appendToEnd(2);
        head.appendToEnd(3);
        head.appendToEnd(4);
        head.appendToEnd(5);
        head.appendToEnd(6);
        head.appendToEnd(7);
        head.appendToEnd(8);
        head.appendToEnd(9);
        head.appendToEnd(10);

        Node n = head.findKthFromEnd(2);
        Node b = head.booksol(head, 2);

        System.out.println(n.data);
        System.out.println(b.data);

    }
}
