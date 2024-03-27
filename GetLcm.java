import java.util.Scanner;

public class GetLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("Enter a First number:");
        int a = sc.nextInt();
        System.out.println("Enter a second number:");
        int b = sc.nextInt();
        for (l = a < b ? a : b; l <= a * b; l++) {
            if (l % a == 0 && l % b == 0)
                break;
            System.out.print("LCM is: ");
            System.out.println(l);
        }
    }
}
