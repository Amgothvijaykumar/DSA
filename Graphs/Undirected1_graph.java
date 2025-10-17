import java.util.*;
public class Undirected1_graph {
    public static void main(String[] args){
        int V=4;
        int[][] graph =new int[V][V];
       
        graph[0][1]=1;
        graph[1][0]=1;
        graph[0][2]=1;
        graph[2][0]=1;
        graph[1][3]=1;
        graph[3][1]=1;
        graph[2][3]=1;
        graph[3][2]=1;

        System.out.println("Adjacency MAtrix:");
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }

     }
}
