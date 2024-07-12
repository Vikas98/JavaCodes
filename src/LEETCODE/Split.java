package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Split {
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] str = sentence.split(" ");
        String subString = "";
        StringBuilder sentance2 = new StringBuilder();

        for(String diction:dictionary)
        {
            System.out.println("word of a dictionary "+diction);
            for(int i = 0;i< str.length;i++)
            {
                System.out.println("word of a sentance "+str[i]);
                if(str[i].length()<diction.length())
                {
                    sentance2.append(str[i]);
                    sentance2.append(" ");
                    continue;

                }
                else
                {
                    subString = str[i].substring(0,diction.length());
                }
                System.out.println("substring is "+subString);
                if(subString.equals(diction))
                {
                    sentance2.append(diction);
                    sentance2.append(" ");
                    break;
                }
                else
                {
                    sentance2.append(str[i]);
                    sentance2.append(" ");
                }
            }
        }

        return sentance2.toString();
    }
    public static void main(String[] args) {
        String str = "the cattle was rattled by the battery";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String s = replaceWords(dictionary,str);
        System.out.println(s);
//        String[] s1 = str.split(" ");
//        for(String s:s1)
//        {
//            System.out.println(s);
//        }
    }
}
