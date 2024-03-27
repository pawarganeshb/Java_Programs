import java.util.Scanner;

public class PrimeNumber {
    static void CheckPrime(int n) {

        int count = 0;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println(n + " is prime number.");
            } else {
                System.out.println(n + " is not prime number.\n");
            }
        } else {
            System.out.println(n + " is not prime number.\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        CheckPrime(n);

    }
}