import java.util.*;

public class CountOddAndEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int Evencount = 0;
        int Oddcount = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                Evencount++;

            } else {
                Oddcount++;
            }
            num /= 10;

        }
        System.out.println("Numbers of even numbers: " + Evencount);
        System.out.println("Numbers of odd numbers: " + Oddcount);
    }

}
