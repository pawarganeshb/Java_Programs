// 7] w.a.p to print armstrong number:
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int cpy = num;
        int sum = 0;
        int rem;
        while (cpy != 0) {
            rem = cpy % 10;
            sum += rem * rem * rem;
            cpy /= 10;

        }
        if (sum == num) {
            System.out.println(num + " is armstrong number.");
        } else {
            System.out.println(num + " is not an armstrong number.");
        }
    }

}
