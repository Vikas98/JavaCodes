package HashMapImplementation;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithSum0 {
    public static int largestSubarrayWithSum0(int [] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int currentSum = 0;
        int lengthOfSubarray = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
           // System.out.print(currentSum+" ");
            if(map.containsKey(currentSum))
            {

                lengthOfSubarray = Math.max(lengthOfSubarray,i-map.get(currentSum));
            }
            else
            {
                map.put(currentSum,i);
            }
        }
       return lengthOfSubarray;
    }
    public static void main(String[] args) {
        int [] arr = {15,-2,-8,1,7,10,23};
        System.out.println("length of maximum subarray "+largestSubarrayWithSum0(arr));
    }
}
