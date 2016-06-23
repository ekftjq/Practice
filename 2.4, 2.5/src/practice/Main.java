package practice;

import java.util.ArrayList;

public class Main {

    public static Node addListForward(Node a, Node b) {
        StringBuilder alist = new StringBuilder();
        StringBuilder blist = new StringBuilder();

        while(a != null) {
            alist.append(a.data);
            a = a.next;
        }
        while(b != null) {
            blist.append(b.data);
            b = b.next;
        }
        String as = alist.toString();
        String bs = blist.toString();

        int an = Integer.parseInt(as);
        int bn = Integer.parseInt(bs);
        int res = an + bn;
        //System.out.println(res);
        String resultstring = Integer.toString(res);

        Node result = new Node(Integer.parseInt(String.valueOf(resultstring.charAt(0))));
        //System.out.println(String.valueOf(resultstring.charAt(1)));
        Node start = result;
        for(int i = 1; i < resultstring.length(); i++) {
            result.next = new Node(Integer.parseInt(String.valueOf(resultstring.charAt(i))));
            //System.out.println(resultstring.charAt(i));
            result = result.next;
            //System.out.println(result.data);
        }
        return start;
    }

    public static Node addListBackword(Node a, Node b) {
        StringBuilder a1 = new StringBuilder();
        StringBuilder b1 = new StringBuilder();

        while(a != null) {
            a1.append(a.data);
            a = a.next;
        }
        while(b != null) {
            b1.append(b.data);
            b = b.next;
        }

        a1.reverse();
        b1.reverse();

        //System.out.println(a1);

        int an = Integer.parseInt(a1.toString());
        int bn = Integer.parseInt(b1.toString());
        int res = an + bn;

        StringBuilder newresult = new StringBuilder(Integer.toString(res));
        newresult.reverse();
        String r = newresult.toString();

        Node result = new Node(r.charAt(0) - '0');
        Node start = result;
        for(int i = 1; i < r.length(); i++) {
            result.next = new Node(r.charAt(i) - '0');
            result = result.next;
        }
        return start;

    }

    public static void main(String[] args) {
        Node n = new Node(2);
        n.appendToEnd(1);
        n.appendToEnd(6);
        n.appendToEnd(5);
        n.appendToEnd(2);
        n.appendToEnd(5);
        n.appendToEnd(7);
        n.appendToEnd(1);
        n.appendToEnd(9);
        n.appendToEnd(3);
        n.printList();
        Node k = n.partitionList(5);
        Node a = n.partitionBooksol(n, 5);
        //a.printList();
        //k.printList();

        Node a1 = new Node(2);
        a1.appendToEnd(3);
        a1.appendToEnd(9);
        a1.appendToEnd(2);

        Node b1 = new Node(3);
        b1.appendToEnd(9);
        b1.appendToEnd(4);
        b1.appendToEnd(5);

        Node r = addListForward(a1, b1);
        Node r1 = addListBackword(a1, b1);
        a1.printList();
        b1.printList();
        r.printList();
        r1.printList();


	// write your code here
    }

}
