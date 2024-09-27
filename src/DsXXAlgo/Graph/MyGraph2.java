import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MyGraph3 {
    private int V;
    private ArrayList<ArrayList<Integer>> adjList;
    public ArrayList<Integer> visitedDfs = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));

    public ArrayList<Integer> ansDfs = new ArrayList<>();
    public MyGraph3(int vertices) {
        V = vertices;
        adjList = new ArrayList<>(V+1);
        for (int i = 0; i<V; i++) {
            if(i==0){
                adjList.add(null);
            }
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }


    public void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> visited = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        System.out.println(STR."Visited = \{visited}");
        ArrayList<Integer> ans = new ArrayList<>();

        queue.add(1);
        visited.set(1,1);

        while (!queue.isEmpty()){
            Integer node = queue.poll();
            ans.add(node);

            for (Integer element : adjList.get(node)) {
                if(visited.get(element)==0){
                    visited.set(element,1);
                    queue.add(element);
                }
            }
        }

        System.out.println(ans);
    }

    public void dfs(int node){
        ArrayList<Integer> conections = adjList.get(node);
        ansDfs.add(node);
        visitedDfs.set(node,1);
        for (int i = 0; i < conections.size(); i++) {
            if(visitedDfs.get(conections.get(i))!=1){
                dfs(conections.get(i));
            }
        }
    }

}

void main(){
    int V = 5;
    MyGraph3 graph = new MyGraph3(V);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 4);
    graph.addEdge(4, 5);
    System.out.println(STR."Main DsXXAlgo.Graph = \{(graph.adjList)}");
    graph.bfs();
    graph.dfs(1);
    System.out.println(graph.ansDfs);
}