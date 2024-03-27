import java.util.Scanner;

public class ReversNumberUsingAllMethod {
    static void mainRev(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        // System.out.println("your revers digits are: " + rev);
    }

    static void strBuffer(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        // System.out.println("your revers digits are: " + rev);
    }

    static void strBuilder(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("your revers digits are: " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and get it's revers order: ");
        int num = sc.nextInt();
        mainRev(num);
        strBuffer(num);
        strBuilder(num);
    }

}
