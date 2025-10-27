import java.util.*;
public class DFSmatrix {
    static int V=4;
    static int[][] graph={
        {0, 1, 1, 0},
        {1, 0, 0, 1},
        {1, 0, 0, 1},
        {0, 1, 1, 0}
    };

    static boolean[] visited=new boolean[V];

    static void DFS(int vertex){
        visited[vertex]=true;
        System.out.print(vertex+" ");

        for(int i=0; i<V; i++){
            if(graph[vertex][i]==1 && !visited[i]){
                DFS(i);
            }
        }

    }
    public static void main(String[] args){
        System.out.print("DFS started from vertex 3:");
        DFS(3);
    }
}
