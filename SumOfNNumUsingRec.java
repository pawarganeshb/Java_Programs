import java.util.*;

public class SumOfNNumUsingRec {
    static int SumOfN(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        } else {
            return n + SumOfN(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N number: ");
        int num = sc.nextInt();
        System.out.println("Sum of 1 to " + num + " is " + SumOfN(num));
    }

}
