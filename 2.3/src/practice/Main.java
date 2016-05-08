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

        head.deleteNode(head.next);
        Node n = head;
        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
