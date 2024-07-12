package DSA;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t)
    {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map1.containsKey(ch))
            {
                map1.put(ch, map1.get(ch)-1);
            }
            else
            {
                return false;
            }
        }
        System.out.println(map1.isEmpty());
        for(Map.Entry<Character,Integer>map : map1.entrySet())
        {
            System.out.println(map.getValue());
            if(map.getValue()>0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "earthv";
        String t = "heartx";
        System.out.println(validAnagram(s,t));
    }
}
