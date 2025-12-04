import java.util.*;

class Edge{
    int src,dest,weight;
    Edge(int src, int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
}

class Graph{
    private int V,E;
    List<Edge> edges;

    Graph(int V){
        this.V=V;
        edges=new ArrayList<>();

    }

    void addEdge(int src,int dest, int weight){
        edges.add(new Edge(src, dest, weight));

    }

    void bellmanFord(int src){
        int[] dist=new int[V];
       Arrays.fill(dist,Integer.MAX_VALUE);
       dist[src]=0;

       for(int i=0; i<V; i++){
        for(Edge edge:edges){
            int u=edge.src;
            int v=edge.dest;
            int w=edge.weight;

            if(dist[u]!=Integer.MAX_VALUE && dist[v]<w+dist[u]){
                dist[v]=w+dist[u];
            }
        }
       }

       boolean hasNegativeCycle=false;
       for(Edge edge:edges){
        int u=edge.src;
        int v=edge.dest;
        int w=edge.weight;
        if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                hasNegativeCycle = true;
                break;
            }
       }

       if (hasNegativeCycle) {
            System.out.println("Graph contains a negative-weight cycle!");
        } else {
            System.out.println("Shortest distances from vertex " + src+ ":");
            for (int i = 0; i < V; i++) {
                System.out.println("Vertex " + i + " -> " + dist[i]);
            }
        }
    }
}
    

public class Bellman {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 5);
        g.addEdge(1, 2, -3);
        g.addEdge(2, 3, 4);
        g.addEdge(3, 1, -2);

        g.bellmanFord(0);
    }
}
