import java.util.Scanner;

public class NumbersOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10 number: ");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int count1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count1++;
            }

        }
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count2++;
            }

        }
        System.out.println("Numbers of Even numbers: "+count1);
        System.out.println("Numbers of Odd numbers: "+count2);
    }

}
