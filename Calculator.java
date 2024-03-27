import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator:");
        System.out.println("Enter a first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter a operation:");
        char op = sc.next().charAt(0);
        System.out.println("Enter a second number:");
        float num2 = sc.nextFloat();
        switch (op) {
            case '+':
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Differ of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multification of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid Operation....");
                break;
        }
    }

}
