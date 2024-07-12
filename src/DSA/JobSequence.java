package DSA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JobSequence {

    static  class job
    {
        int id;
        int profit;
        int deadline;

        public job(int i, int p, int d) {
             id = i;
             profit = p;
            deadline = d;
        }
    }

    public static void main(String[] args) {

        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new job(i,jobsInfo[i][1], jobsInfo[i][0]));
        }
        jobs.sort((a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time=0;
        int maxProfit = 0;
        for(int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            System.out.println(curr.deadline+" "+ curr.profit+" "+ curr.id);
            if(curr.deadline>time)
            {
                seq.add(curr.id );
                maxProfit += curr.profit;
                time++;
            }
        }
       // System.out.println("max profit is "+maxProfit+"\n"+"jobs are "+seq);
    }
}
