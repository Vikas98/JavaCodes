package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String roman)
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans  = 0;
        for (int i = 0; i < roman.length(); i++) {
            if(i<roman.length()-1 && map.get(roman.charAt(i))<map.get(roman.charAt(i+1)))
            {
                ans -= map.get(roman.charAt(i));
            }
            else
            {
                ans += map.get(roman.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String roman = "IV";
        System.out.println(romanToInt(roman));
    }
}
