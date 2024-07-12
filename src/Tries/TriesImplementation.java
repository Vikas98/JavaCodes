package Tries;

public class TriesImplementation {
    static class Node
    {
        Node [] children = new Node[26];
        boolean eow = false;
        public Node()
        {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word)
    {
       // System.out.println("hello i am insert called by break down problem");
        Node curr = root;
        for (int i = 0; i < word.length() ; i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word)
    {
       // System.out.println("hello i am  search called by break down problem");
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static void main(String[] args) {
//        String [] words = {"the","a","there","their","any","thee"};
//        for (int i = 0; i < words.length; i++) {
//            insert(words[i]);
//        }
//        System.out.println(search("any"));
        String [] words = {"i","like","sam","samsung","mobile"};
        String key = "ilikesam";
        for (int i = 0; i < words.length ; i++) {
            insert(words[i]);
        }
        System.out.println(breakDown(key));
    }
    public static boolean breakDown(String key)
    {
        if(key.length()==0)
            return true;
        for (int i = 1; i <=key.length() ; i++) {
            if(search(key.substring(0,i)) && breakDown(key.substring(i)))
            {
                return true;
            }
        }
        return false;
    }

}
