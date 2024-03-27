import java.util.Scanner;

public class CountNumberOfCharecter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int strLength = str.length();
        System.out.println("Enter a character to find: ");
        String chrstr = sc.nextLine();
        str = str.replace(chrstr, "");
        int charLength = str.length();
        System.out.println("Total number of occurences: " + chrstr + " is " + (strLength - charLength));

    }

}
