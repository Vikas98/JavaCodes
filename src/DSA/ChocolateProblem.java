package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateProblem {
    public static void main(String[] args) {
        int n = 4 , m = 6;
        Integer costHor[] = {2,1,3,1,4};
        Integer costVer[] = {4,1,2};
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());
        int h = 0 , v = 0;
        int hp = 1, vp = 1;
        int minCost = 0;
        while (h<costHor.length && v<costVer.length)
        {
            if(costHor[h]>=costVer[v])
            {
                minCost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else
            {
                minCost += (costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length)
        {
            minCost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v<costVer.length)
        {
            minCost += (costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println(minCost);
    }
}
