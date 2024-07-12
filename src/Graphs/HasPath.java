package Graphs;

import java.util.ArrayList;

public class HasPath {

    // we use dfs to implement this method
    public static boolean hasPath(ArrayList<GraphImp.Edge>[] graph , int src, int dist,boolean[] visited)
    {
        if(src == dist)
            return  true;
        visited[src] = true;
        //System.out.println("Size of graph "+graph[src].size());
        for (int i = 0; i <graph[src].size(); i++) {
            GraphImp.Edge  edge = graph[src].get(i);
            if(!visited[edge.dist] && hasPath(graph,edge.dist,dist,visited)){
                return true;
            }

        }
        return false;
    }
}
