
// 14] w.a.p to print prime number:
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Prime(n);
        sc.close();
    }

    private static void Prime(int n) {
        int count = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    ++count;
                }
            }
            if (count == 2) {
                System.out.println(n + " is prime number.");
            } else
                System.out.println(n + " is not prime number.");
        } else
            System.out.println(n + " is not prime number.");
       
    }

}
