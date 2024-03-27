
//5] w.a.p to print arithnatic operation number.
import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the 2 number: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Sum is: " + (n1 + n2));
        System.out.println("Differ is: " + (n1 - n2));
        System.out.println("Multi is: " + (n1 * n2));
        System.out.println("division is: " + (n1 / n2));
    }

}
