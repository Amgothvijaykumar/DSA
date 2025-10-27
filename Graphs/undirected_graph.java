import java.util.*;
public class undirected_graph{
    public static void main(String[] args){
        int V=4;

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        //initialization of list
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1); // A-B
        graph.get(1).add(0);
        graph.get(0).add(2); // A-C
        graph.get(2).add(0);
        graph.get(1).add(3); // B-D
        graph.get(3).add(1);
        graph.get(2).add(3); // C-D
        graph.get(3).add(2);
        graph.get(2).add(2);


        System.out.println("Adjacency List:");
        for(int i=0; i<V; i++){
            System.out.println("Vetex "+i+" -> "+graph.get(i));
        }
    }
}