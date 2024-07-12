package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {
    public  static  Queue<Integer> interleaveQueue(Queue<Integer> Q)
    {
        int size = Q.size();
        int n = size/2;
        Queue<Integer> q1 = new LinkedList<>();
        while(n>0)
        {
            int ele = Q.remove();
            q1.add(ele);
            n--;
        }
        while(q1.size()!=0)
        {
            Q.add(q1.remove());
            Q.add(Q.remove());
        }
        return  Q;
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();


        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        interleaveQueue(q1);
        System.out.println(q1);
    }
}
