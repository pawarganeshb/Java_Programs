import java.util.Scanner;

public class CheckAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 7, 5, 4, 2, 6 };
        System.out.print("Before Delting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\nEnter the you want to remove: ");
        int delete = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (delete == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];

                }
                break;
            }

        }
        System.out.print("After Deleting: ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}