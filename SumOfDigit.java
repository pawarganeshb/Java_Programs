import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        long num = sc.nextLong();
        long sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num/=10;
        }
        System.out.println("Sum of digits is: "+sum);
    }

}
