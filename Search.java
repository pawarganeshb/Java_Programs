import java.util.*;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " number:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Search Number: ");
        int s = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.println("Find at " + (i + 1) + "th position.");
                break;
            } else
                System.out.println("Not found.");

        }

    }
}