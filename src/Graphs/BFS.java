package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void bfs(ArrayList<GraphImp.Edge>[] graph)
    {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visted = new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty())
        {
            int curr = q.remove();
            if(!visted[curr])
            {
                System.out.print(curr+" ");
                visted[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    GraphImp.Edge e = graph[curr].get(i);
                    q.add(e.dist);
                }
            }
        }
    }
}
