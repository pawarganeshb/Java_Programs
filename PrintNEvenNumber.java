import java.util.Scanner;

public class PrintNEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n number:");
        byte n = sc.nextByte();
        System.out.print("Even number list is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(2*i+"\t");

        }
    }

}
