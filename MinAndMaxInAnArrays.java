import java.util.Scanner;

public class MinAndMaxInAnArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10 number: ");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("Maximum number in an array is: " + max);
        System.out.println("Minimum number in an array is: " + min);
    }

}
