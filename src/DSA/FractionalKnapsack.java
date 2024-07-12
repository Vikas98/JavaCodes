package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public  static  int fractionalKnapsack(int[] val , int[] weight, int W)
    {
        int capacity = W;
        int FinalAns = 0;

        Double [][] ratio = new Double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = (double) i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = ratio.length-1; i >=0 ; i--) {

            int idx = (ratio[i][0]).intValue();
            System.out.println(idx);
            if (capacity>=weight[idx])
            {
                FinalAns += val[idx];
                capacity -= weight[idx];
            }
            else
            {
                FinalAns += (int) (ratio[i][1] * capacity);
                break;
            }
        }
        return FinalAns;
    }
    public static void main(String[] args) {
        int val[] = {60,100,120};

        int weight[] = {10,20,30};

        int W = 50;
        System.out.println(fractionalKnapsack(val,weight,W));
    }
}
