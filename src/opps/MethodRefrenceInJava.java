package opps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefrenceInJava {

    public static void main(String[] args) {
        String[] str1 = {"GFG","IDE","VIKAS"};
        String[] str2 = {"gfg","ide","vikas"};

        if(Arrays.equals(str1,str2,String::compareToIgnoreCase))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println();
        }
    }

}
