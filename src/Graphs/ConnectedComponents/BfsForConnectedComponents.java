package Graphs.ConnectedComponents;

import Graphs.GraphImp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsForConnectedComponents {
    public static void bfs(ArrayList<GraphImp.Edge>[] graph)
    {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i])
            {
                bfsUtil(graph,visited);
            }
        }
    }
    public static void bfsUtil(ArrayList<GraphImp.Edge>[] graph,boolean [] visited)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty())
        {
            int curr = q.remove();
            if(!visited[curr])
            {
                System.out.print(curr+" ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Graphs.GraphImp.Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }
}
