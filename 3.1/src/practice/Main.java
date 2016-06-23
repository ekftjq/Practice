package practice;

public class Main{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(1311);
        s.push(43);
        s.push(556);
        s.push(62);
        System.out.println(s.findMin());
    }
}