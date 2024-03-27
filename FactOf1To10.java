// 16] w.a.p to print Factorial of 1 to 10:-
public class FactOf1To10 {
    public static void main(String[] args) {
        int fact = 1;

        for (int i = 1; i <= 10; i++) {
            fact *= i;
            System.out.println("Factorial of " + i + " is: " + fact + " ");

        }
    }

}
