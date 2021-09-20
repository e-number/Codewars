public class Solution {

    public static void main(String[] args) {
        humanReadableTime(75945);
        digitalRoot(16);
        between(1, 4);
    }
    public static void humanReadableTime(int seconds) {
        String humanReadableTime = String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
        System.out.println(humanReadableTime);
    }

    public static void digitalRoot(int n) {
        int digRoot = (1 + (n - 1) % 9);
        System.out.println(digRoot);
    }


    public static void between(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
