package DSA;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static Map<Integer,Integer> majorityElements(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
       // System.out.println(map);
        return map;
    }
    public static void main(String[] args) {
        int [] nums ={1,1,3,2,5,1,3,1,5,3};
        Map<Integer,Integer> map = majorityElements(nums);
        int majority = nums.length/3;
        System.out.print("Majority elements in existing array  ");
        for(Map.Entry<Integer, Integer> map1:map.entrySet())
        {
            if(map1.getValue() > majority)
                System.out.print(map1.getKey()+" ");
        }
    }
}
