package LEETCODE;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxWater  = 0;
        while(start<end)
        {
            int water = Math.min(height[start],height[end])*(end-start);
            System.out.println("max water till "+water);
            maxWater = Math.max(maxWater,water);
            System.out.println("total maxwater " +maxWater);
            if(height[start]<=height[end])
            {
                start++;
            }else
                end--;
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }
}
