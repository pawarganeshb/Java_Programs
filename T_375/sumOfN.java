import java.util.Scanner;

public class sumOfN {
    static int getSum(int n) {
        return n * (n + 1) / 2;
    }

    static int getsum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer number: ");
        int n = sc.nextInt();

        int sum = getSum(n);
        System.out.println("The sum of " + 1 + " to " + n + " is: " + sum);
        int s = getsum(n);
        System.out.println(s);
    }
}
