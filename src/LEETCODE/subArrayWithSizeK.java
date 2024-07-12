package LEETCODE;

public class subArrayWithSizeK {
    public static int minKBitFlips(int [] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {

            if (nums[i]==1)
            {

            }
            else {
                if(i+k> nums.length-1)
                    return -1;
                for (int j = i; j < i + k; j++) {
                      nums[j] = nums[j] | 1;
                }
                count++;
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
                return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0};
        int k = 2;
        System.out.println(minKBitFlips(nums, k));
    }
}
