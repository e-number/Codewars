
public class Solution {

    public static String humanReadableTime(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public static int digitalRoot(int n) {
        return (1 + (n - 1) % 9);
    }
}
