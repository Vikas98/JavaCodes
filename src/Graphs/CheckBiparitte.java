package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheckBiparitte {
    public static boolean isBipartite(ArrayList<GraphImp.Edge>[] graph)
    {
        int[] color = new int[graph.length];
        for (int i = 0; i <graph.length ; i++) {
            color[i] = -1;// assign -1 means no color associate with the edge
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (color[i]==-1)
            {
                queue.add(i);
                color[i] = 0; // yellow color
                while (!queue.isEmpty())
                {
                    int curr = queue.remove();
                    for (int j = 0; j <graph[curr].size() ; j++) {
                        GraphImp.Edge edge = graph[curr].get(j);
                        if(color[edge.dist]==-1)
                        {
                            int nextCol = color[curr]==0 ? 1:0;
                            color[edge.dist] = nextCol;
                            queue.add(edge.dist);
                        }
                        else if(color[edge.dist]==color[curr])
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
