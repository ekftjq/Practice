package practice;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Moon on 2016-06-20.
 */
public class Node {
    int data;
    ArrayList<Node> nodes;
    boolean route = false;

    public Node(int data) {
        this.data = data;
        nodes = new ArrayList<>();
    }

    public void addNode(int data) {
        Node n = new Node(data);
        this.nodes.add(n);
    }

    public void addNode(Node n) {
        this.nodes.add(n);
    }


    public boolean checkRoute(Node a, Node b) {
        for(Node n : a.getNodes()) {
            if(n == b) {
                route = true;
            }
            //System.out.print(n.data + " , ");
            checkRoute(n, b);
        }
        return route;
    }

    public ArrayList<Node> getNodes() {
        return this.nodes;
    }

    public boolean search(Node start, Node end) {
        LinkedList<Node> q = new LinkedList<>();

        q.add(start);
        Node u;
        while(!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for(Node v : u.getNodes()) {
                    if (v == end) {
                        return true;
                    } else {
                        q.add(v);
                    }
                }
            }

        }
        return false;
    }
}
