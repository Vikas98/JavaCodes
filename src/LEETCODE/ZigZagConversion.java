package LEETCODE;

public class ZigZagConversion {
    public static String zigzagConversion(String str,int numRow)
    {
        if(numRow==1) return str;
        int n = str.length();
        StringBuffer[] arr = new StringBuffer[numRow];
        for (int i = 0; i < numRow; i++) {
            arr[i] = new StringBuffer();
        }
        int k = 0;
        while(k<n)
        {
            //vertically downword
            for(int i = 0;i<numRow && k<n;i++)
            {
                arr[i].append(str.charAt(k++));
            }
            //bend upword
            for(int i = numRow-2;i>0 && k<n;i--)
            {
                arr[i].append(str.charAt(k++));
            }
        }
        StringBuffer ans = new StringBuffer();
        for(StringBuffer ele:arr)
        {
            ans.append(ele);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(zigzagConversion(str,6));
    }
}
