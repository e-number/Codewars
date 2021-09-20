import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        humanReadableTime(76920);
        digitalRoot(16);
        between(1, 4);
        currentDate();
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
    public static void currentDate() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date now = new Date();
        Date copiedDate = new Date(now.getTime());
        System.out.println(df.format(copiedDate));
    }

}
