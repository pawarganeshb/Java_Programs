import java.util.Scanner;

public class ReversStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Revers string is: " + reversstr(str));
    }

    private static String reversstr(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reversstr(str.substring(1)) + str.charAt(0);
    }

}
