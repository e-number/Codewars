import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        humanReadableTime(75533);
        digitalRoot(16);
        between(1, 4);
    }
    public static String humanReadableTime(int seconds) {
        String humanReadableTime = String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
        System.out.println(humanReadableTime);
        return humanReadableTime;
    }

    public static int digitalRoot(int n) {
        int digRoot = (1 + (n - 1) % 9);
        System.out.println(digRoot);
        return digRoot;
    }


    public static int[] between(int a, int b) {
        int nums[] = new int[0];
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
        return nums;
    }
}
