package Graphs.ConnectedComponents;

import Graphs.GraphImp;

import java.util.ArrayList;

public class CycleDetection {
    public static boolean CycleDetection(ArrayList<GraphImp.Edge>[] graph)
    {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i])
            {
                if(CycleDetectionUtil(graph,visited,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean CycleDetectionUtil(ArrayList<GraphImp.Edge>[] graph,boolean[] visited,int curr,int par)
    {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            GraphImp.Edge edge = graph[curr].get(i);
            if(!visited[edge.dist] && CycleDetectionUtil(graph,visited, edge.dist,curr))
            {
                return true; // case 3 neighbous is not visited and neighbour tell that cycle present
            }
            else if(visited[edge.dist] && edge.dist != par)
            {
                return true;
            }
        }
        return false;
    }
}
