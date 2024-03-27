import java.util.Scanner;

public class ThreeWaysToFindNumberdOfCount {
    static int iterative(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;

        }
        return count;
    }

    static int recursive(int n) {
        if (n == 0) {
            return 0;

        }
        return 1 + recursive(n / 10);
    }

    static int convert(int n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // System.out.println("Number of digits are: " + iterative(n));
        // System.out.println("Number of digits are: " + recursive(n));
        System.out.println("Number of digits are: " + convert(n));
        sc.close();
    }

}
