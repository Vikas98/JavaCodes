package LEETCODE;

public class AppendChar {
    public static int appendCharacters(String s, String t) {
        int appendChar = t.length();
        int k = 0;
        for(int i = 0;i<s.length()&&k<appendChar;i++)
        {
            System.out.println(s.charAt(i)+" "+ t.charAt(k));
            if(s.charAt(i) == t.charAt(k))
            {
                k++;
            }
        }
        return appendChar-k;
    }

    public static void main(String[] args) {
        System.out.println(appendCharacters("zbc","abc"));
    }
}
