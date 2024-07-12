package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MinIncrement {
    public static  int minIncrementForUnique(int[] nums) {
        int minIncrements = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            // Ensure each element is greater than its previous
            if (nums[i] <= nums[i - 1]) {
                // Add the required increment to minIncrements
                int increment = nums[i - 1] + 1 - nums[i];
                minIncrements += increment;

                // Set the element to be greater than its previous
                nums[i] = nums[i - 1] + 1;
            }
        }

        return minIncrements;
    }

    public static void main(String[] args) {
        int nums[] ={1,1,1,2,2,7};
      //System.out.println(  minIncrementForUnique(nums));
      Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int k = 0;
        for(Integer i:map.keySet())
        {
            int count = map.get(i);
            if(count>=2)
            {
                for(int j = 0;j<2;j++)
                {
                    nums[k]=i;
                    k++;
                }
            }
            else
            {
                nums[k]=i;
                k++;
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
       // System.out.print(map.keySet());
    }
}
