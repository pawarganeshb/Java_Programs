import java.util.Scanner;

public class Literals {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter a first number:");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        if (num1 % 2 == 0) {
            System.out.print(num1);
            System.out.println(" is even number.");
        } else {
            System.out.print(num1);
            System.out.println(" is odd number.");
        }

    }
}