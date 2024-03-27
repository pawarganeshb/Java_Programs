import java.util.Scanner;

public class SumOfTwoStringAsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string as number: ");
        String s1 = sc.nextLine();
        System.out.println("Once again enter the string as number: ");
        String s2 = sc.nextLine();
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println("Sum of two strings: " + sum);

    }

}
