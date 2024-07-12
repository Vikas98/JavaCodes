package LEETCODE;

public class PatchingArrayWithLinearSpace {
    public static int PatchArray(int[] arr,int n)
    {
        int count  = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        if (sum == n)  return count;
        else if(sum < n)
        {
            int nextEle = nextElement(arr,n);
            System.out.println("hello");
        }
        return count;
    }
    public static int nextElement(int arr[],int n)
    {
        int ele = 0;
        int k = 0;
        int smallest = smallest(arr,k++)+1;
        System.out.println(smallest);
        for (int i = 0; i < arr.length; i++) {
            if(smallest == arr[i])
            {
                smallest = smallest(arr,k++)+1;
                System.out.println("inside if smallest is " +smallest);
            }
        }
        System.out.println("outside if " +smallest);
        return smallest;
    }
    public static int smallest(int [] nums,int i)
    {
        return nums[i];
    }
    public static void main(String[] args) {
          //PatchArray(new int[]{1,2,2,3},12);
          double d = Math.sqrt(101);
           System.out.println(Math.ceil(Math.sqrt(100)));
          if(d == (int) d)
          {
              System.out.println(true);
          }
          else
          {
              System.out.println(false);
          }
    }
}
