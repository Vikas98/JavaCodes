package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPair {


    public static int maxlengthpair(int[][] pairs)
    {
        int ans = 0;


        Arrays.sort(pairs, Comparator.comparingDouble(o-> o[1]));
        int chainEnd = pairs[0][1];
        System.out.println(chainEnd);
        ans++;
        for (int i = 1;i<pairs.length;i++)
        {
            if(pairs[i][0]>chainEnd)
            {
                ans++;
                chainEnd = pairs[i][1];
                System.out.println(chainEnd);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        System.out.println(maxlengthpair(pairs));
    }
}
