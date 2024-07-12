package Tries;

public class breakDownProblem {
    public static void main(String[] args) {
        String [] words = {"i","like","sam","samsung","mobile"};
        String key = "ilike";
        for (int i = 0; i < words.length ; i++) {
            TriesImplementation.insert(words[i]);
        }
        System.out.println(breakDown(key));
    }
    public static boolean breakDown(String key)
    {
        if(key.length()==0)
            return true;
        for (int i = 1; i <=key.length() ; i++) {
           // boolean b = TriesImplementation.search(key.substring(0,i));
            if(TriesImplementation.search(key.substring(0,i)) && breakDown(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }

}
