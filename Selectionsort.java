import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 number:");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min, temp = 0;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }

            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.print("After the sorting: ");
        for (int i : a) {
            System.out.print(i + "\t");

        }
    }

}
