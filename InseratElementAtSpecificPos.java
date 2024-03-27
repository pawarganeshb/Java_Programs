//Insert element at given position:
import java.util.Scanner;

public class InseratElementAtSpecificPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 element");
        int arr[] = new int[6];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Inserting: ");
        for (int i : arr) {

            System.out.println(i + "\t");
        }
        System.out.println("Enter the location:");
        int loc = sc.nextInt();
        System.out.println("Enter the element:");
        int elem = sc.nextInt();
        for (int i = arr.length - 1; i > loc; i--) {
            arr[i] = arr[i - 1];
        }
        arr[loc] = elem;
        System.out.print("After Inserting:");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

}
