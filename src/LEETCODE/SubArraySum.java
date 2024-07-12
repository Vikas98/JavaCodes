package LEETCODE;

import java.util.HashMap;

public class SubArraySum {
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, 1); // Initialize with remainder 0 having frequency 1

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;

            // Adjust negative remainder to be positive
            if (remainder < 0) {
                remainder += k;
            }

            // Check if this remainder has been seen before
            if (remainderMap.containsKey(remainder)) {
               // System.out.println(remainderMap.containsKey(remainder));
                count += remainderMap.get(remainder);
            }

            // Update the frequency of the current remainder
            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
           // System.out.println(remainderMap);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println("Number of subarrays divisible by " + k + ": " + subarraysDivByK(nums, k));
    }
}
