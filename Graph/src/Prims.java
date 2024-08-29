
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class Prims {
    static class Edge implements Comparable<Edge>{
        int weight;
        int source ;
        int destination;
        Edge(int weight, int source, int destination){
            this.weight = weight;
            this.source = source;
            this.destination = destination;
        }
        @Override
        public int compareTo(Edge other){
            return this.weight - other.weight;
        }
    }

    public static void main(String[] args) {
        List<Edge>[] graph = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        List<Edge> Node0= new ArrayList<>();

        Edge e1  = new Edge(70, 0, 1);
        Edge e2 = new Edge(80, 0,  2);


        graph[0]  = Node0;

        List<Edge> Node1 = new ArrayList<>();


        Edge e3 = new Edge(70, 1, 0);
        Edge e4 = new Edge(10, 1, 2);
        Edge e5 = new Edge(50, 1, 4);
        Edge e6 = new Edge(30, 1, 3);

        graph[1]  = Node1;

        List<Edge> Node2 = new ArrayList<>();

        Edge e7 =  new Edge(60, 2, 3);
        Edge e8 =  new Edge(80, 2, 0);
        Edge e9 =  new Edge(10, 2, 3);
        Edge e10 = new Edge(40, 2, 4);

        graph[2] = Node2;

        List<Edge> Node3 = new ArrayList<>();


        Edge e11 = new Edge(30, 3,1);
        Edge e12 = new Edge(60, 3, 2);
        Edge e13 = new Edge(20, 3, 4);

        graph[3] = Node3;

        List<Edge> Node4 = new ArrayList<>();


        Edge e14 = new Edge(50, 4, 1);
        Edge e15 = new Edge(40, 4, 2);
        Edge e16 = new Edge(20, 4, 3);

        graph[4] = Node4;

        Prims prims = new Prims();
        prims.primsalgo(graph);
    }

    public void primsalgo(List<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int start = 0;
        pq.add(new Edge(start, start, 0));

        int ans = 0;
        while (!pq.isEmpty()) {

            Edge cur = pq.poll();

            int u = cur.destination;

            if (vis[u]) {
                continue;
            }

            ans =ans+ cur.weight;
            vis[u] = true;

            for (Edge edge : graph[u]) {
                if (!vis[edge.destination]) {
                    pq.add(edge);
                }
            }
        }

        System.out.println(" weight: " + ans);
    }
}