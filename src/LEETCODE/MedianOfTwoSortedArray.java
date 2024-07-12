package LEETCODE;

public class MedianOfTwoSortedArray {
    public static float median(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n + m];
        int k = 0;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }
        if (i < n) {
            ans[k++] = nums1[i++];
        }
        if (j < m) {
            ans[k++] = nums2[j++];
        }
        float median = 0;
        float sum = 0;
        int start = 0;
        int end = ans.length;
        if (ans.length % 2 == 0) {
            int mid = start + (end - start) / 2;
            sum = ans[mid] + ans[mid - 1];
            median = sum / 2;
        } else
        {
            int mid = start + (end - start) / 2;
            median = ans[mid];
        }
        return median;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2};
        int [] arr2 = {3,4};
        System.out.println(median(arr1,arr2));
    }
}
