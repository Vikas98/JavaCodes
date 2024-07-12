package LEETCODE;

public class LongestSubStringWithoutrepeatingCharacters {
    public static int lonestSubstring(String s){
        int start = 0;
        int end = 0;
        int maxlength = 0;
        while(end < s.length())
        {
            char currentchar = s.charAt(end);
            for(int i = start ;i<end;i++)
            {
                if(s.charAt(i) == currentchar)
                {
                    start = i+1;
                    break;
                }
            }
            maxlength = Math.max(maxlength,end-start+1);
            end++;
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lonestSubstring(str));
    }
}
