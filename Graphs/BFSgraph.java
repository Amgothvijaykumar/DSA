
import java.util.*;

class Graph {
    private int V;
    private List<List<Integer>> adj;

    public Graph(int V){
        this.V = V;
        adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new LinkedList<>());
        }
    }

    public void addEdge(int v, int w){
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    void BFS(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");

            for(int neighbor : adj.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class BFSgraph {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(3,4);

        System.out.println("Traversal of BFS from 0:");
        g.BFS(0);
    }
}
