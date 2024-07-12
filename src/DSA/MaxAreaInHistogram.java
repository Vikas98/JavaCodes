package DSA;

import java.util.Stack;

public class MaxAreaInHistogram
{
    public static  int MaxArea(int[] nums)
    {
        int n = nums.length;
        int currArea = 0;
        int maxArea = 0;
        int [] leftMin = new int[n];
        int [] rightMin= new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[st.peek()] >= nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                rightMin[i] = n;
            }
            else
            {
                rightMin[i] = st.peek();
            }
            st.push(i);
        }
        st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            while(!st.isEmpty() && nums[st.peek()] >= nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                leftMin[i] = -1;
            }
            else
            {
                leftMin[i] = st.peek();
            }
            st.push(i);
        }
        for (int i = 0 ;i<n ;i++)
        {
             int height = nums[i];
             int width = rightMin[i]-leftMin[i]-1;
             currArea = height*width;
             maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int [] nums = {2,1,5,6,2,3};
        System.out.println("maximum area is "+MaxArea(nums));
    }
}
