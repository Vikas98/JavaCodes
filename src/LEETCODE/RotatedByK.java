package LEETCODE;

public class RotatedByK {
    public static void rotated(int[] nums,int k)
    {
       for (int i = 0; i < k; i++) {
           int lastEle = nums[nums.length-1];
           for (int j = nums.length-1; j>0 ; j--) {
               nums[j] = nums[j-1];
           }
           nums[0] = lastEle;
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
//        int  k = 3;
//        rotated(nums,k);
//        for (int i = 0; i < nums.length ; i++) {
//            System.out.print(nums[i]+" ");
//        }

    }
}
