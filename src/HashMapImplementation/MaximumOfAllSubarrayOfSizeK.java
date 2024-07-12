package HashMapImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumOfAllSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i <=arr.length-k ; i++) {
            for (int j = i; j <k+i ; j++) {
                 pq.add(arr[j]);
              //  System.out.println("inside j "+j+""+pq);
            }
           System.out.println("After every j "+pq);
            System.out.print(pq.peek()+" ");
        }
    }
}
