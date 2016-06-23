package practice;

/**
 * Created by Moon on 2016-06-17.
 */
public class Stack {
    Node top;

    public Stack() {

    }

    public void push(Object data) {
        Node item = new Node(data);
        item.next = top;
        top = item;
    }

    public Object pop() {
        if(top != null) {
            Node item = top;
            top = top.next;
            return item.data;
        }
        return null;
    }


}
