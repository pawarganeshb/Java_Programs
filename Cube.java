
//3] w.a.p to print cube of given number:
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int cube = num * num * num;
        System.out.println("Cube of " + num + " is: " + cube);
    }

}
