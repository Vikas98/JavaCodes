package LEETCODE;
import java.util.ArrayList;
import java.util.List;
public class GenerateAllParenthesis {
    public static List<String> generateparenthesis(int n)
    {
        List<String> ans = new ArrayList<>();
        generateAllParentesis(ans,0,0,"",n);
        return ans;
    }
    public static void generateAllParentesis(List<String>ans,int left,int right,String s,int n)
    {
        if(s.length()==n*2)
        {
            ans.add(s);
            return;
        }
        if (left<n)
        {
            generateAllParentesis(ans,left+1,right,s+"(",n);
        }
        if (right<left)
        {
            generateAllParentesis(ans,left,right+1,s+")",n);
        }
    }
    public static void main(String[] args) {
        List<String> ans = generateparenthesis(3);
        System.out.println(ans);
    }
}
