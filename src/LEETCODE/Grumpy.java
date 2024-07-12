package LEETCODE;

import java.util.*;

public class Grumpy {
    static class indexes implements Comparable<indexes>
    {
        int index;
        int sum;

        public indexes(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }

        @Override
        public int compareTo(indexes o) {
          return   this.sum - o.sum;
        }

        @Override
        public String toString() {
            return "indexes{" +
                    "index=" + index +
                    ", sum=" + sum +
                    '}';
        }
    }
    public static List<indexes> index(int nums[],int minutes)
    {
        int sum = 0;
        int dummySum = 0;
        List<indexes>  al = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        for (int i = 0; i < nums.length; i++) {
            int dummyindex = i-minutes<0?-1:i-minutes;
            if (dummyindex==-1)
            {
                dummySum = 0;
            }
            else
            {
                dummySum = nums[i-minutes];
            }
            al.add(new indexes(i,nums[i]- dummySum));
        }
       System.out.println(al);
        return al;
    }
    public static void main(String[] args) {
        int [] nums = {1,0,1,2,1,1,0,2};
        index(nums,3);
        //System.out.println(index);
    }
}
