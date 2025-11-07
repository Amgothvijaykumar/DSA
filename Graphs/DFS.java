import java.util.*;

class Graph{
    private int V;
    private List<List<Integer>> adj;

    Graph(int V){
        this.V=V;
        adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
    }
    void addEdge(int v, int w){
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    void DFSutil(int v, boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");

        for(int neighbor: adj.get(v)){
            if(!visited[neighbor]){
                DFSutil(neighbor, visited);
            }
        }
    }

    void DFS(int v){
        boolean[] visited=new boolean[V];
        DFSutil(v,visited);
    }
}

public class DFS {
    public static void main(String[] args){
        Graph g=new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1,4);
        System.out.println("The DFS starting from vertex 0:");
        g.DFS(0);
    }
}
