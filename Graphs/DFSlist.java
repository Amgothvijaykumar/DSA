import java.util.*;
public class DFSlist {
     static void addEdge(ArrayList<ArrayList<Integer>> graph,int u, int v){
        graph.get(v).add(v);
        graph.get(u).add(v); //undirected graph

     }

     static void DFS(int vertex,boolean[] visited,ArrayList<ArrayList<Integer>> graph){
        visited[vertex]=true;
        System.out.print(vertex+" ");

        for(int neighbor:graph.get(vertex)){
            if(!visited[neighbor]){
                DFS(neighbor,visited, graph);
            }
        }
     }

     public static void main(String[] args){
        int V=4;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0; i<V; i++) graph.add(new ArrayList<>());

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);

        boolean[] visited=new boolean[V];
        System.out.print("DFS started from vertex 0: ");

        DFS(0,visited,graph);
     }
    
}
