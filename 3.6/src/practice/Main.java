package practice;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Stack s = new Stack();
        s.push(9);
        s.push(7);
        s.push(4);
        s.push(8);
        s.push(1);
        s.push(3);
        s.push(7);
        Stack a = s.sort(s);
        a.printStack();
        System.out.println("adklj");
        a.printStack();
        //s.printStack();
        System.out.println(s.isEmpty());
        //System.out.println(a.pop());
        //System.out.println(a.pop());
    }
}
