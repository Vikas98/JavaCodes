package DSA;



public class Main2 {
    public static int varArgs(int... x)
    {
        int sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];
     return     sum;

    }
    public static void main(String[] args) {
       System.out.println(varArgs(1,2,3,4,5,6,7,8,9,10));
    }
}
