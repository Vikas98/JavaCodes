package DSA;

public class MiniJump {
    static int minJumps(int[] arr){
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }

        int jumps = 0;
        int currEnd = 0;
        int currFarthest = 0;

        for (int i = 0; i < n - 1; i++) {
            currFarthest = Math.max(currFarthest, i + arr[i]);

            if (i == currEnd) {
                jumps++;
                currEnd = currFarthest;
            }
        }

        return currEnd < n - 1 ? -1 : jumps;
    }
    public static void main(String[] args) {

        int [] arr = {8 ,3 ,27 ,13 ,13};
        System.out.print(minJumps(arr));
    }
}
