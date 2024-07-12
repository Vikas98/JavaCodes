package DSA;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ConetNRopes {
    public static void main(String[] args) {
//        int [] ropes = {2,3,3,4,6};
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i = 0; i < ropes.length ; i++) {
//            pq.add(ropes[i]);
//        }
//        int sum = 0;
//        int cost = 0;
//        while(pq.size()>1){
//            int firstEle = pq.remove();
//            int secondEle = pq.remove();
//            sum = firstEle+secondEle;
//            cost += sum;
//            pq.add(sum);
//            System.out.println(firstEle+" "+secondEle+" "+pq);
//        }
//        System.out.print(cost);
        TreeSet ts = new TreeSet();
        ts.add(6);
        ts.add(5);
        ts.add(7);
        ts.add(8);
        ts.add(1);
        ts.add(2);

        TreeSet hdset = new TreeSet();
        hdset = (TreeSet)ts.headSet(6);
        Iterator itr = hdset.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
    }
}
