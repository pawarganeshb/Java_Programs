import java.util.Scanner;

public class ReversAnArray {
    static void simpleRevers(int a[]) {
        System.out.print("\nAfter reversing array: ");
        for (int i = a.length - 1; i > -1; i--) {
            System.out.print(a[i] + "\t");

        }
    }

    static void usingTemp(int a[]) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        System.out.print("\nAfter reversing array: ");
        for (int i : a) {
            System.out.print(i + "\t");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 element :");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        System.out.print("Before reversing array: ");
        for (int i : a) {
            System.out.print(i + "\t");

        }
        simpleRevers(a);
        usingTemp(a);

    }

}