import java.util.Scanner;

public class PangramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean cpy = isPangram(str.toLowerCase());
        if (cpy == true) {
            System.out.println("your string is pangram.");
        } else {
            System.out.println("your string is not the pangram.");
        }
    }

    private static boolean isPangram(String str)

    
    {
        if (str.length() < 26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (str.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}