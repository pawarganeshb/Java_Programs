import java.util.Scanner;

public class EvenNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for range of even and odd: ");
        int num = sc.nextInt();
        System.out.print("Even numbers up 1 to " + num + " is: ");
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
            
        }
        System.out.print("\nOdd numbers up 1 to "+ num +" is: ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
            
        }
    }

}
