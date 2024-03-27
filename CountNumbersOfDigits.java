import java.util.Scanner;

public class CountNumbersOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        long num = sc.nextLong();
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Numbers of digits are: " + count);
    }

}
