import java.util.*;

public class ReversNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev = 0;
        // int cpy = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;

        }
        System.out.println("Revers is:" + rev);

    }
}