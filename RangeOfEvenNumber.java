import java.util.Scanner;

public class RangeOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.print(num1 + " To " + num2 + " in range: ");
        for (int i = num1; i <= num2; i++) {
            System.out.print((2 * i) + "\t");

        }
    }

}
