package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node n = new Node(23);
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Queue {

}