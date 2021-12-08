/**
 * Node class used for a simple linked list.
 */
public class Node {

    public int vertex;
    public Node next;

    public Node(int vertex) {
        this.vertex = vertex;
        this.next = null;
    }

    public Node(int vertex, Node node) {
        this(vertex);
        this.next = node;
    }

    public Node clone() {
        Node cloned = new Node(this.vertex);
        if (null != this.next) {
            cloned.next = this.next.clone();
        }
        return cloned;
    }
}