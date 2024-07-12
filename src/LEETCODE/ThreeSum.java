package LEETCODE;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums)
    {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            while (j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(target==sum)
                {
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                }
                else if(sum>target)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
