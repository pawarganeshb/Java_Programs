import java.util.Scanner;

public class SumOfNUsingRecursion {
    static void printsum(int i, int num, int sum) {
        if (i == num) {
            sum += i;
            System.out.println("Sum is: "+sum);
            return;
        }
        sum += i;
        printsum(i + 1, num, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        printsum(i, num, sum);
    }

}
