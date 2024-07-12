package LEETCODE;

public class LongestPalindrome2 {
    public static void longestPalindrome(String s) {
        if(s.length()==1)return ;
        int[] arr = new int[26];
        for(int i=0;i< arr.length && i<s.length();i++)
        {
            arr[i] = s.charAt(i)-'a';
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        longestPalindrome("abccccdd");
    }
}
