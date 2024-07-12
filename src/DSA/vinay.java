package DSA;

import java.util.Scanner;

public class vinay {
    public static int appSpace(int [] arr)
    {
        int totalSpace = arr[0];
        int app1Space = arr[1];
        int app2Space = arr[2];
        int app3Space = arr[3];
        if(totalSpace - (app1Space+app2Space) > app3Space) {
            return 0;
        }
        else if(totalSpace - (app1Space+app2Space) < app3Space) {
            if(totalSpace-app1Space > app3Space || totalSpace-app2Space > app3Space) {
                return 1;
            }
        }

        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(appSpace(arr));
    }

}
