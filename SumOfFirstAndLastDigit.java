import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;

        }
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num /= 10;

        }
        System.out.println("Your First Digit is: " + firstDigit);
        System.out.println("Your Last Digit is: " + lastDigit);
        System.out.println("Sum of all digits:" + sum);
        System.out.println("sum of First and Last Digit is: " + (firstDigit + lastDigit));
    }

}
