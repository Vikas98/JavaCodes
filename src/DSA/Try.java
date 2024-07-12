package DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String str = br.readLine();
        System.out.println("enter a integer value");
        int i = Integer.parseInt(br.readLine());
        System.out.println("reading string using console");
        String  s = System.console().readLine();
        System.out.println(str+ " " + i + " "+ s);


    }
}
