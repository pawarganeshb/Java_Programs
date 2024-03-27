import java.util.Scanner;

public class JustCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        if (num == 0) {
            System.out.println("Given number is zero.");
        } else if (num < 0) {
            System.out.println("Given number is Negative.");

        } else {
            System.out.println("Given number is Positive.");
        }
    }

}
