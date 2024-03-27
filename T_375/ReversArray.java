import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a = { 73, 97, 81, 200, 8 };
        int a[] = new int[5];
        System.out.print("Enter the 5 number: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        int length = a.length;
        System.out.print("Revers array: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
