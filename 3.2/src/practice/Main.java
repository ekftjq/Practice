package practice;

/**
 * Created by Moon on 2016-06-15.
 */
public class Main {
    public static void main(String[] args) {
        SetofStacks s = new SetofStacks(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.popAt(0));
        s.push(13);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        /*
        Stack s1 = new Stack();
        s1.push(4);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        */
    }
}
