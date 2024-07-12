package Graphs.ConnectedComponents;

import Graphs.GraphImp;

import java.util.ArrayList;

public class DfsForConnectedComponents {
    public static void Dfs(ArrayList<GraphImp.Edge>[] graph)
    {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i])
            {
                dfsUtil(graph,i,visited);
            }
        }
    }
    public static void dfsUtil(ArrayList<GraphImp.Edge> graph[], int curr, boolean [] visit)
    {
        System.out.print(curr+" ");
        visit[curr] = true;
        for (int i = 0;i<graph[curr].size();i++)
        {
            GraphImp.Edge e = graph[curr].get(i);
            if (!visit[e.dist])
            {
                dfsUtil(graph,e.dist,visit);
            }
        }
    }
}
