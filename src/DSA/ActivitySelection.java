package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ActivitySelection {

    public  static  int activitySelction(int [] startTime , int [] endTime)
    {
        int count=0;
        Arrays.sort(endTime);
        int selectedActivity = endTime[0];
        count++;
        for (int i = 1; i < endTime.length; i++) {
            if(startTime[i]>=selectedActivity)
            {
                selectedActivity = endTime[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] startTime = {10,12,20};
        int [] endTime = {20,25,30};

        System.out.println("Maximum activity performed by a person is "+activitySelction(startTime,endTime));

        int number = 10;

        Queue<Integer> q1 = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        q1.add(1);
       System.out.println(q1.isEmpty());
    }
}
