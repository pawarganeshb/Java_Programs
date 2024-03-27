import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int length = str.length();
        String rev = "";
        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        System.out.println("Your Revers String Is: " + rev);
    }

}
