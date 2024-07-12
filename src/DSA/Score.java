package DSA;

public class Score {
    public  static int scoreOfString(String s) {
        int n = s.length();
        int score = 0;
        for(int i = 0;i<n-1;i++)
        {
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) s.charAt(i+1);
            System.out.println(ascii1+" "+ascii2);
            score += Math.abs(ascii1 - ascii2);
        }
        return score;
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
}
