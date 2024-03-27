import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(In asending order): ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the search number: ");
        int s = sc.nextInt();
        int start = 0, end = 4, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (s == a[mid]) {
                System.out.println("your number is found at " + (mid + 1) + "th position.");
                break;
            } else if (s < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        if (start > end) {
            System.out.println("your number is not found.");
        }
    }

}
