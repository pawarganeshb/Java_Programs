import java.util.Scanner;
public class SmallestBetweenThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number:");
        byte num1 = sc.nextByte();
        System.out.println("Enter a second number:");
        byte num2 = sc.nextByte();
        System.out.println("Enter a third number:");
        byte num3 = sc.nextByte();
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is smallest number.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is smallest number.");
        } else {
            System.out.println(num3 + " is smallest number.");
        }
    }
}
