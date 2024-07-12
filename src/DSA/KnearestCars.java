package DSA;

import java.util.PriorityQueue;

public class KnearestCars {
    static class Point implements Comparable<Point>
    {
        int x;
        int y;
        int distSq;
        int index;

        public Point(int y, int distSq, int x, int index) {
            this.y = y;
            this.distSq = distSq;
            this.x = x;
            this.index = index;
        }
        @Override
        public int compareTo(Point p2)
        {
            return this.distSq - p2.distSq;
        }
    }
    public static void countNearestcars(int[][] points ,int k)
    {
        PriorityQueue<Point> pq = new PriorityQueue<Point>();
        for(int i = 0;i < points.length;i++)
        {
            int distsq = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Point(points[i][1],distsq,points[i][0],i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.remove().index);
        }
    }
    public static void main(String[] args) {
        int [][] points = {{3,3},{5,-1},{-2,4}};
        countNearestcars(points,3);
    }
}
