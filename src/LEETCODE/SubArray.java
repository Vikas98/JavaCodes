package LEETCODE;

public class SubArray {
    public static int longestSubarray(int[] nums, int limit) {
        int ans = 0;
        int maxLength = 0;
        int length = 0;
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = i;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])<=limit)
                {
                    length = (j-i)+1;
                    System.out.println("length is "+length);
                }
                maxLength = Math.max(maxLength,length);
                System.out.println("MaxLength is "+maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {8,2,4,7};
        int limit = 4;
        longestSubarray(nums,limit);
    }
}
