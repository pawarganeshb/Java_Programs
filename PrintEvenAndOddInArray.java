import java.util.Scanner;

public class PrintEvenAndOddInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 number: ");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Even numbers  in an array: ");
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + "\t");
            }
        }
        System.out.print("\nOdd numbers in an array: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + "\t");
            }

        }

    }
}
