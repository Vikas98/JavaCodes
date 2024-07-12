package DSA;

import java.util.HashSet;
import java.util.Set;

public class Stair {
    public static int arrangeCoins(int n) {
        if(n==0) return 0;
        int count = 0;
        int stair = 1;
        while(n>=0)
        {
            if(n >= stair)
                count++;

            n = n-stair;
            stair++;

        }
        return count;
    }
    public static int arrangeCoins1(int n) {
        // Calculate the maximum k using the derived formula
        int k = (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2); // Cast n to long to prevent overflow
        return k;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins1(8));
        System.out.println((int)(-1+(Math.sqrt(1+8* (long) 8))/2));
        Set<Integer> set = new HashSet<>();
    }
}
