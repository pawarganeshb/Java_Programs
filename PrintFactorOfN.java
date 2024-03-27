import java.util.Scanner;

public class PrintFactorOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Factor of "+ n +" is: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + "\t");
            }

        }
    }

}
