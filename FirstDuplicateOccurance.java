import java.util.Scanner;

public class FirstDuplicateOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 numbers: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i] + " First occurance position:- " + (i + 1) + " Second occurance:- " + (j + 1)
                            + " position");

                }

            }

        }
    }

}
