import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        humanReadableTime(73215);
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
        int[] numbersBetween = new int[(b-a) + 1];

        for(int i = 0 ; i < numbersBetween.length; i++) {
            numbersBetween[i] = a + i;
        }
        System.out.println(Arrays.toString(numbersBetween));
    }



    public static void currentDate() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date now = new Date();
        Date copiedDate = new Date(now.getTime());
        System.out.println();
        System.out.println("===================");
        System.out.println(df.format(copiedDate));
    }
}
