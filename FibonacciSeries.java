import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and get fibonacci series:");
        int num = sc.nextInt();
        int a = -1, b = 1;
        System.out.print("Fibonacci series is: ");
        for (int i = 1; i <= num; i++) {
            int c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
        }
    }
}
