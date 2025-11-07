import java.util.*;
class Pair{
    int vertex;
    int weight;
    
    Pair(int vertex,int weight){
        this.vertex=vertex;
        this.weight=weight;
    }
}

class Graph{
    private int V;
    private List<List<Pair>> adj;
    
    Graph(int V){
        this.V=V;
        adj= new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
    }
    
    void addEdge(int u, int v, int w){
        adj.get(u).add(new Pair(v,w));
        adj.get(v).add(new Pair(u,w));
    }
    
    void dijkstra(int source){
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;
        
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.weight));
        pq.add(new Pair(source,0));
        
        while (!pq.isEmpty()){
            Pair current=pq.poll();
            int u=current.vertex;
            
            for(Pair neighbor:adj.get(u)){
                int v=neighbor.vertex;
                int weight=neighbor.weight;
                
                if(dist[u]+weight<dist[v]){
                    dist[v]=dist[u]+weight;
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }
        
        System.out.println("Shortest distances from vertex "+ source+" :");
        for(int i=0; i<V; i++){
            System.out.println("Vertex "+i +"-> "+dist[i]);
            
        }
    }
}

public class DijAlg {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 1);
        g.addEdge(1, 3, 7);
        g.addEdge(2, 3, 3);

        g.dijkstra(0);
    }
}
