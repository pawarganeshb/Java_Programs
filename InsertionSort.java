import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 number: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }

        System.out.print("\nBefore sorting: ");
        for (int i : a) {
            System.out.print(i + "\t");

        }
        int temp = 0, j;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;

            }
            a[j] = temp;
        }
        System.out.print("\nAfter the sorting: ");
        for (int i : a) {
            System.out.print(i + "\t");

        }

    }

}
