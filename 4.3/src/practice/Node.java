package practice;

import java.util.ArrayList;

/**
 * Created by Moon on 2016-06-20.
 */
public class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
        left = null;
        right = null;
    }

    public void addLeft(Node n) {
        left = n;
    }

    public void addRight(Node n) {
        right = n;
    }

    public Node makeBST(int[] array) {
        return makeBSTHelper(array, 0, array.length-1);
    }

    private Node makeBSTHelper(int[] array, int start, int end) {
        if(end < start) {
            return null;
        }
        int mid = (end+start)/2;
        //System.out.println(p);
        Node root = new Node(array[mid]);
        root.left = makeBSTHelper(array, start, mid -1);
        root.right = makeBSTHelper(array, mid +1, end);
        return root;
    }

    private int[] getArray(int[] array, int start, int end) {
        int[] result = new int[end-start];
        for(int i = 0; i < end-start; i++) {
            result[i] = array[start+i];
        }
        return result;
    }

    private int getMiddle(int[] array) {
        //System.out.println(array.length);
        return array[array.length/2-1];
    }

    public void print(Node n) {
        if(n == null) {
            return;
        }
        System.out.println(n.data);
        print(n.left);
        System.out.println("right");
        print(n.right);
    }

    public Node createMinimalBST(int arr[], int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        Node n = new Node(arr[mid]);
        n.left = createMinimalBST(arr, start, mid -1);
        n.right = createMinimalBST(arr, mid +1, end);
        return n;
    }

    public Node createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length-1);
    }
}
