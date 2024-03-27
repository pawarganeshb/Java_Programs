import java.util.Scanner;

public class InNumberOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int num = sc.nextInt();
        int eCount = 0;
        int oCount = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 == 0)
                eCount++;
            else {
                oCount++;
            }
            num /= 10;

        }
        System.out.println("Total even numbers are: " + eCount);
        System.out.println("Total odd numbers are: " + oCount);
    }

}
