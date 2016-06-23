package practice;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Moon on 2016-06-22.
 */
public class Tree {
    Node root;

    public Tree(int data) {
        root = new Node(data);
    }

    /*
    public LinkedList<Node> createDepthList(int depth, Tree t) {
        LinkedList<Node> list = new LinkedList<>();
        if(depth == 0) {
            list.add(t.root);
            return list;
        }
        int num = (int) Math.pow(2, (double) depth) - 1;
        //System.out.println(num);
        Queue q = new Queue();
        q.enqueue(t);
        while(!q.isEmpty()) {
            if(num == 0) {
                break;
            }
            Tree a = q.dequeue();
            //System.out.println(a.root.data);
            q.enqueue(a.left);
            q.enqueue(a.right);
            num--;
            //System.out.println(num);
        }
        while(!q.isEmpty()) {
            Tree a = q.dequeue();
            list.add(a.root);
        }
        return list;
    }
    */

    public ArrayList<LinkedList<Node>> NodesAtDepth(Tree root) {
        ArrayList<LinkedList<Node>> result = new ArrayList<>();
        LinkedList<Node> current = new LinkedList<>();
        current.add(root.root);
        while(current.size() > 0) {
            result.add(current); //add current
            LinkedList<Node> parent = current; //Go to next level
            current = new LinkedList<>();
            for(Node t : parent) {
                if(t.left != null) {
                    current.add(t.left);
                }
                if(t.right != null) {
                    current.add(t.right);
                }
            }
        }
        return result;
    }
}
