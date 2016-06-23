package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node circle = new Node(1);
        circle.appendToEnd(2);
        Node start = new Node(6);
        circle.appendNodeToEnd(start);
        circle.appendToEnd(3);
        circle.appendToEnd(2);
        circle.appendToEnd(3);
        circle.appendNodeToEnd(start);

        circle.findLoop(circle);
        //circle.printList(circle);

        //System.out.println(circle.findLoop(circle).data);
    }
}
