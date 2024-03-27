
//4] w.a.p to print sum of two number.
import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the two number: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum of " + n1 + " and " + n2 + " is: " + sum);
    }

}
