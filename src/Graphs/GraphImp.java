package Graphs;

import java.util.ArrayList;
import static Graphs.CheckBiparitte.isBipartite;


public class GraphImp {
   // public static GraphImp.Edge Edge;
    public static class Edge
    {
        int src;
        public int dist;
        int weight;

        public Edge(int src, int dist, int weight) {
            this.src = src;
            this.dist = dist;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> [] graph)
    {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0,2,5));
        graph[1].add(new Edge(1,3,5));
        graph[1].add(new Edge(1,0,5));
        graph[2].add(new Edge(2,4,1));
        graph[2].add(new Edge(2,0,1));
//        graph[2].add(new Edge(2,3,1));
//        graph[2].add(new Edge(2,4,2));
//        graph[3].add(new Edge(3,1,3));
      //  graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,1,1));

     // .  graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,2,2));

    }
   public static boolean cycleDetect(ArrayList<Edge>[] graph)
   {
       boolean [] visited = new boolean[graph.length];
       for (int i = 0; i < graph.length; i++) {
           if(!visited[i])
           {
               if(cycleDetectutil(graph,visited,i,-1))
               {
                   return true;
               }
           }
       }
       return false;
   }
   public static boolean cycleDetectutil(ArrayList<Edge>[]graph,boolean [] visited,int curr,int par)
   {
       visited[curr]=true;
       for (int i = 0; i < graph[curr].size(); i++) {
           Edge e = graph[curr].get(i);
           if(!visited[e.dist])
           {
               if( cycleDetectutil(graph,visited,e.dist,par))
                  return true;
           }
           else if(visited[e.dist] && e.dist != par ) {
               return true;
           }
       }
       return false;
   }
public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
//        for (int i = 0; i < graph[2].size() ; i++) {
//            Edge e = graph[2].get(i);
//            System.out.print(e.dist+" ");
//        }
//        System.out.println();
//       BFS.bfs(graph);
//       System.out.println();
//       Dfs(graph,0,new boolean[V]);
//       System.out.println();
//       System.out.println(HasPath.hasPath(graph,0,3,new boolean[V]));
//       Graphs.ConnectedComponents.BfsForConnectedComponents.bfs(graph);
//       System.out.println();
//       Graphs.ConnectedComponents.DfsForConnectedComponents.Dfs(graph);
//       System.out.println();
      System.out.println(cycleDetect(graph));
      System.out.println(isBipartite(graph));
    }
}
