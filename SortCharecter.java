import java.util.Arrays;
import java.util.Scanner;

public class SortCharecter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char charArr[] = str.toCharArray();
        Arrays.sort(charArr);
        String sorted = new String(charArr);
        System.out.println("Sorted string: "+sorted);
    }

}
