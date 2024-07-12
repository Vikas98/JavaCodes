package LEETCODE;

import java.util.*;

public class MostProfitAssignToWorker {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<difficulty> list = new ArrayList<>();
        for(int i = 0;i<difficulty.length;i++)
        {
            list.add(new difficulty(difficulty[i],profit[i]));
        }
        Collections.sort(list,(Comparator.comparingInt(o -> o.difficulty)));
        System.out.println(list);
        int maxProfit = 0;
        for (int i = 0; i < worker.length ; i++) {
            int profit1 = 0;
            int j = 0;
            while(j<list.size() && list.get(j).difficulty <= worker[i]) {
                    System.out.println(worker[i]+" and dificulty "+list.get(j).difficulty+ " and profit "+list.get(j).profit);
                    profit1 = Math.max(profit1,list.get(j).profit);
                    ++j;
            }
           // System.out.println("profit came out for "+worker[i]+"  is "+ profit1);
            maxProfit += profit1;
        }
        return maxProfit;
    }
   static class difficulty
   {
       int difficulty;
       int profit;

       public difficulty( int difficulty,int profit) {
           this.profit = profit;
           this.difficulty = difficulty;
       }
   }
    public static void main(String[] args) {
        int[] difficulty = {68,35,52,47,86};
        int[] profit = {67,17,1,81,3};
        int[] worker = {92,10,85,84,82};
       System.out.println(maxProfitAssignment(difficulty,profit,worker));

    }
}
