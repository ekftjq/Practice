package practice;

public class Main {

    public static void main(String[] args) {
        MyQueue a = new MyQueue();
        a.enqueue(1);
        a.enqueue(2);
        System.out.println(a.dequeue());
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.enqueue(6);
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
	// write your code here
    }
}
