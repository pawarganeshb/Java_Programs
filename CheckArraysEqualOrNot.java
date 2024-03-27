import java.util.Arrays;
import java.util.Scanner;

public class CheckArraysEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 element for first arrays:");
        int[] a1 = new int[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();

        }
        System.out.println("Enter a 5 element for second arrays:");
        int[] a2 = new int[5];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();

        }

        /*
          if (Arrays.equals(a1, a2)) {
          System.out.println("Both arrays are equal.");
          } else {
          System.out.println("Both array are not equal.");
          }
         */
        boolean check=true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    check = false;
                }

            }
        } else {
            check = false;
        }
        if (check == true) {
            System.out.println("Both arrays are equals.");
        } else {
            System.out.println("Both arrays are not equals");
        }

    }

}