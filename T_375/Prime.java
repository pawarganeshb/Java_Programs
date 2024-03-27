import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();
        getPrime(num);

    }

    private static void getPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 2) {
            System.out.println("Its Prime Number.");
        } else {
            System.out.println("Its Not Prime Number.");
        }
    }
}
