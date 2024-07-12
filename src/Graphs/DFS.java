package Graphs;

import java.util.ArrayList;

public class DFS {
    public static void Dfs(ArrayList<GraphImp.Edge> graph[], int curr, boolean [] visit)
    {
        System.out.print(curr+" ");
        visit[curr] = true;
        for (int i = 0;i<graph[curr].size();i++)
        {
            GraphImp.Edge e = graph[curr].get(i);
            if (!visit[e.dist])
            {
                Dfs(graph,e.dist,visit);
            }
        }
    }
}
