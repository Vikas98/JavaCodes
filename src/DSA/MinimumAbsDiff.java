package DSA;

import java.util.Arrays;

public class MinimumAbsDiff {

    public static int minimumAbsDiff(int [] A,int[] B)
    {
        int minDiff = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int [] A = {4,1,7,8};
        int [] B = {2,3,6,5};

        System.out.println(minimumAbsDiff(A,B));
    }
}
