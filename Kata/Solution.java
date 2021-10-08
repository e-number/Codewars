import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) {
        humanReadableTime(73215);
        digitalRoot(16);
        between(1, 4);
        simplePigLatin("Pig latin is cool");
        maximumSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        even_or_odd(0);
        simpleMultiplication(24);
        multiplesOf3or5(10);
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

    public static void simplePigLatin(String str) {
        String pig = str.replaceAll("(\\w)(\\w*)", "$2$1ay");
        System.out.println(pig);
    }

    public static void even_or_odd(int number) {
        if (number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }

    public static void maximumSubarraySum(int[] arr) {
        int cur = 0, max = 0;
        for (int i : arr) {
            cur = Math.max(0, cur + i);
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }

    public static void simpleMultiplication (int n) {
        System.out.println(n % 2 == 0 ? n * 8 : n * 9);
    }

    public static void multiplesOf3or5(int number) { System.out.println(IntStream.range(0, number).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum());
//        int sum = 0;
//        for (int i = 1; i < number; i++) {
//            if (i % 3 == 0 || i % 5 == 0) sum += i;
//        }
//        System.out.println(sum);
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
