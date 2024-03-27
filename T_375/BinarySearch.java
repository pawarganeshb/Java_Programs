import java.util.Scanner;

public class BinarySearch {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[] { 12, 23, 34, 45, 56 };
        System.out.println("could you enter the search number: ");
        int s = sc.nextInt();
        int mid;
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (s == a[mid]) {
                System.out.println(s + " is found at " + (mid + 1) + "th position.");
                break;
            } else if (s < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start > end) {
            System.out.println(s + " is not found.");
        }
        sc.close();
    }

}
