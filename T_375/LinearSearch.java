import java.util.Scanner;

public class LinearSearch {
    boolean b;

    public static void main(String[] args) {
        int[] a = new int[] { 73, 97, 81, 200, 8 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Could you enter your search number:");
        int s = sc.nextInt();
        boolean temp = true;
        for (int i = 0; i < a.length; i++) {
            if (s == a[i]) {
                System.out.println(s + " is found at " + (i + 1) + "th position.");
                temp = false;
                break;
            }

        }
        if (temp == true)
            System.out.println(s + " is not found.");
    }
}