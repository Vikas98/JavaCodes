package HashMapImplementation;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoArray {
    public static void unionOfTwoArray(int[] arr1,int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < Math.max(arr1.length, arr2.length); i++) {
           if(i< arr1.length)
               set.add(arr1[i]);
           if(i< arr2.length)
               set.add(arr2[i]);
        }
        System.out.println("Union of arr1 and arr2 "+ set);
    }
    public static void intersectionOfTwoArray(int[] arr1,int[] arr2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < arr1.length ; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(set1.contains(arr2[i]))
            {
                set1.remove(arr2[i]);
                ans.add(arr2[i]);
            }
        }
        System.out.println("Intersection of array1 and array2 is "+ans);
    }

    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4};
        unionOfTwoArray(arr1,arr2);
        intersectionOfTwoArray(arr1,arr2);

    }
}
