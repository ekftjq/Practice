package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack a = new Stack();
        Stack b = new Stack();
        Stack c = new Stack();
        int n = 5;
        a.push(5);
        a.push(4);
        a.push(3);
        a.push(2);
        a.push(1);
        moveHanoi(n, a, b, c);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }

    public static void moveHanoi(int ndisk, Stack source, Stack aux, Stack dest) {
        if(ndisk == 1) {
            //System.out.println(source.peek());
            dest.push(source.pop());
        }
        else {
            moveHanoi(ndisk-1, source, dest, aux);
            dest.push(source.pop());
            moveHanoi(ndisk-1, aux, source, dest);

        }

    }
}
