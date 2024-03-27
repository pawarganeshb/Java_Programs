import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 element: ");
        int a[] = new int[5];
        int i;
        int temp = 0;
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Which number you want: ");
        int s = sc.nextInt();
        for (i = 0; i < a.length; i++) {
            if (s == a[i]) {

                System.out.println(s + " is found at " + (i + 1) + "th Position.");
                temp = 1;
                break;
            }
        }
        if (temp == 0) {
            System.out.println(s + " is not found,");
        }
    }

}
