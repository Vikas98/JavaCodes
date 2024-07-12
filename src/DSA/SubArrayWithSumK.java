package DSA;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumK {
    public static int subArrayWithSumK(int [] arr,int k)
    {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int currentSum = 0;
        int count=0;
        for (int i =0 ;i<arr.length;i++)
        {
            currentSum += arr[i];
            if(map.containsKey(currentSum-k))
            {
                count += map.get(currentSum-k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {10,2,-2,-20,10};
        System.out.println(subArrayWithSumK(arr,-10));
    }
}
