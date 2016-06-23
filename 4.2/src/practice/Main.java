package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node graph = new Node(1);
        Node add = new Node(5);
        graph.addNode(3);
        graph.addNode(33);
        graph.nodes.get(0).addNode(3);
        graph.nodes.get(0).addNode(1);
        graph.nodes.get(0).addNode(6);
        graph.nodes.get(0).nodes.get(0).addNode(4);
        graph.nodes.get(0).nodes.get(0).nodes.get(0).addNode(2);
        System.out.println(graph.checkRoute(graph, add));
        System.out.println(graph.search(graph, add));
    }
}
