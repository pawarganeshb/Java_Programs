import java.util.Arrays;
import java.util.Scanner;

public class SortNumberUsingBuildIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 number: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // System.out.println("Before Sorting: " + Arrays.toString(a));
        // Arrays.parallelSort(a);
        // System.out.println("After Sorting: " + Arrays.toString(a));

        System.out.println("Before Sorting: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting: " + Arrays.toString(a));
    }

}
