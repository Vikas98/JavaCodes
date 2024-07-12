package LEETCODE;

public class SearchInSortedAndRotatedArray {
    public static int search(int[] nums, int target) {
        int i = 1;
        for(;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                break;
            }
        }
        //System.out.print("break point is " +i+"\n");
        int start =i+1;
        while (start != i)
        {

            if(nums[start] == target)
                return start;
            start++;

            if(start==nums.length)
                start = start%nums.length;
        }
        return -1;
    }

    public static void main(String[] args) {
       int [] nums = {4,5,6,7,0,1,2};

       System.out.print(search(nums,7));
    }
}
