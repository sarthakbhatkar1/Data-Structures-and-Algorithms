/**
 * Graph class
 */
public class Graph {

    public int n;
    public int m;
    public Node[] edges;
    public int[] edgesCount;

    public Graph(int n, int m, Node[] edges, int[] edgesCount) {
        this.n = n;
        this.m = m;
        this.edges = edges;
        this.edgesCount = edgesCount;
    }

    public Graph clone() {
        Node[] edges = new Node[this.n];
        for (int i = 0; i < n; i++) {
            edges[i] = new Node(this.edges[i].vertex, this.edges[i].next.clone());
        }
        return new Graph(this.n, this.m, edges, this.edgesCount.clone());
    }
}