
//1) Program to demonstrate Constant Variable
import java.util.Scanner;

public class ConstVareable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your DateOfBirth:");
        final String DOB = sc.nextLine();
        System.out.println("Your DateOfBirth is " + DOB);
    }

}
