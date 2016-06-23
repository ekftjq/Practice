package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node pan = new Node(3);
        pan.appendToEnd(4);
        pan.appendToEnd(2);
        pan.appendToEnd(18);
        pan.appendToEnd(2);
        pan.appendToEnd(4);
        pan.appendToEnd(3);
        System.out.println(pan.checkPanlindrome(pan));
    }
}
