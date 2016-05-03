package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(7);
        head.appendToTail(5);
        head.appendToTail(5);
        head.appendToTail(6);
        Node head2 = head;
        head.removeDuplicates();
        head2.removeDupbooksolution(head2);
        Node n = head2;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
