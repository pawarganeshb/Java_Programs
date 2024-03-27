import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.print("Enter the 5 element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("\nBefore deleting: ");
        for (Integer integer : arr) {
            System.out.print(integer + " ");

        }
        System.out.print("\nEnter the loction of element: ");
        Integer location = sc.nextInt();
        for (Integer i = location; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
            
        }
        System.out.print("After the deleting: ");
      for (int i = 0; i < arr.length-1; i++) {
          System.out.print(arr[i]+" ");
          
      }

    }
}
