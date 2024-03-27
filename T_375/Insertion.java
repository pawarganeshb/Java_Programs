import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 4 number: ");
        int[] a = new int[5];
        for (int i = 0; i < a.length-1; i++) {
            a[i] = sc.nextInt();

        }

        System.out.print("Enter the value of insert in array: ");
        int value = sc.nextInt();
        System.out.print("Enter the location of insert in array: ");
        int loc = sc.nextInt();
        for (int i = a.length - 1; i > loc; --i) {
            a[i] = a[i-1];
        }
        a[loc] = value;
        System.err.print("This is your final array: ");
        for (int i : a) {
            System.out.print(i + " ");

        }
        sc.close();
    }
}