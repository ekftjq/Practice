package practice;

/**
 * Created by Moon on 2016-06-17.
 */
public class MyQueue {
    private Stack a;
    private Stack b;
    private int size_a;
    private int size_b;

    public MyQueue() {
        a = new Stack();
        b = new Stack();
        size_a = 0;
        size_b = 0;
    }

    /*

           4
           5
      3    4
     */

    public void enqueue(Object data) {
        a.push(data);
        size_a++;
    }

    public Object dequeue() {
        //System.out.println("size is:" +size_b);
        if(size_b > 0) {
            size_b--;
            return b.pop();
        }
        //System.out.println("hello");
        while(size_a > 0) {
            b.push(a.pop());
            size_b++;
            size_a--;
            //System.out.println("size a:" +size_a);
        }
        size_b--;
        return b.pop();
    }
}
