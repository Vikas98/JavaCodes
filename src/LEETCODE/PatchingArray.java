package LEETCODE;

import java.util.*;

public class PatchingArray {
    public static int patachingArray(int[] nums,int n)
    {
        int count=0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println(sum);
        if (sum == n)return count;
        else if (sum < n) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 1; i <= n ; i++) {
                map.put(i,0);
            }
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            System.out.println(map);
            for(Map.Entry<Integer,Integer> map1 : map.entrySet())
            {
//
                System.out.println("value of map "+map1.getValue()+" and "+map1.getKey());
                if(map1.getValue()==0)
                {
                    System.out.println("sum is "+sum);
                    sum = sum+map1.getKey();
                    count++;
                    if(sum >= n) return count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,5,10};
        int n = 20;
        System.out.println(patachingArray(nums,n));
    }
}
