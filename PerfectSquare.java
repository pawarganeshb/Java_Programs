import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {

            if (i * i == num) {
                System.out.println("Your number is perfectly divisible by: " + i);
            }
            else{
                System.out.println("Can not be divisible. ");
            }
        }

    }

}
