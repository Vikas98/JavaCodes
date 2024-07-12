package DSA;

import java.util.*;

public class IndianCoins {

    public static int indianCoins(Integer [] coins,int val)
    {
        int n = coins.length;
        Arrays.sort(coins, Comparator.reverseOrder());
        int count=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0;i<n;i++)
        {
            if(coins[i]<=val)
            {
                while (val>=coins[i])
                {
                    ans.add(coins[i]);
                    count++;
                    val -= coins[i];
                }
            }
        }
        System.out.println("coins or notes used " +ans);
        return  count;
    }
    public static void main(String[] args) {
        Integer [] coins = {1,2,5,10,20,50,100,500,2000};

        int value = 590;

        System.out.println("total coin used "+indianCoins(coins,value));

        int [] arr = {10,20,30,50};

        int count = 1;
        int item = 0;
        for(int i = 0;i< arr.length;i++)
        {
            item = item^arr[i];

            System.out.println(item);
            if(item == 0)
            {
                count--;
            }
            else {
                count++;

            }
        }

        System.out.println(count-1+"      "+item);

        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);

        while(!dq.isEmpty())
        {
            System.out.println(dq.getLast());
            dq.removeLast();
        }
    }
}
