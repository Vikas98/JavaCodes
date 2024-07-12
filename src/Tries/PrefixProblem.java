package Tries;

import java.util.*;

public class PrefixProblem {
    static class Node
    {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;
        public Node()
        {
            for (int i = 0; i <children.length ; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();
    public static void insert(String word)
    {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.children[idx]==null)
            {
                curr.children[idx]= new Node();
               // curr.freq = 1;
            }
            else
            {
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow = true;
    }
    public static String prefix(String word)
    {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            //System.out.println("frequency of "+word.charAt(i)+" is "+curr.children[idx].freq);
            if(curr.children[idx].freq == 1)
            {
               prefix.append(word.charAt(i));
               return prefix.toString();
            }else
            {
                prefix.append(word.charAt(i));
            }
            curr=curr.children[idx];
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String [] words = {"zebra","dog","duck","dove","zen"};
        for (int i = 0; i <words.length ; i++) {
            insert(words[i]);
        }
        List<String> str = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            str.add(prefix(words[i]));
           // prefix(words[i]);
        }
        System.out.println(str);
    }
}
