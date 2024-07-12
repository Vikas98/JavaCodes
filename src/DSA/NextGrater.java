package DSA;

import java.util.Stack;

public class NextGrater {

    public  static void nextGrater(int nums[])
    {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int [] ans = new int[n];
        for (int i = n-1; i>=0 ; i--) {
            while (!st.isEmpty() &&  nums[st.peek()]<=nums[i])
                st.pop();

            if(st.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]= nums[st.peek()];
            }
           st.push(i);
        }

        for (int i = 0 ; i <n ;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] nums = {6,8,0,1,3};
        nextGrater(nums);
    }
}
