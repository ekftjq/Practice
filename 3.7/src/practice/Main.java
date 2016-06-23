package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue a = new Queue();
        a.enqueue(true);
        a.enqueue(true);
        a.enqueue(false);
        a.enqueue(true);
        a.enqueue(false);
        a.enqueue(true);
        a.enqueue(false);
        a.enqueue(false);

        a.enqueue(true);
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeueCat());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeueDog());

    }
}
