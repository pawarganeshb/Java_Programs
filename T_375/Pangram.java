import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.err.println(IsPangram(str.toLowerCase()));

    }

    private static boolean IsPangram(String str) {
        if (str.length() < 26) {
            return false;
        } else {
            for (char i = 'a'; i < 'z'; i++) {
                if (str.indexOf(i) < 0) {
                    return false;
                }

            }
        }
        return true;
    }
}