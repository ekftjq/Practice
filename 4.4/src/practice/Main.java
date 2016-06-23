package practice;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree r = new Tree(1);
        r.root.addleft(2);
        r.root.addright(3);
        r.root.left.addleft(4);
        r.root.left.addright(5);
        r.root.right.addleft(6);
        r.root.right.addright(7);
        r.root.left.left.addleft(8);
        ArrayList<LinkedList<Node>> a = r.NodesAtDepth(r);
        for(int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                System.out.println(a.get(i).get(j).data);
            }
        }
    }
}
