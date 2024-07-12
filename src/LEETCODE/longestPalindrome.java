package LEETCODE;

import java.util.ArrayList;

public class longestPalindrome {


    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("abc");
        al.add("abcd");
        al.add("vikas");
        int length = 0;
        int maxlength = 0;
        String str="";
        for (int i = 0; i < al.size(); i++) {
            System.out.println("size is "+ al.get(i).length());
            length = al.get(i).length();
            if(length>maxlength)
            {
                str = al.get(i);
            }
        }
        System.out.println(str);
    }
}
