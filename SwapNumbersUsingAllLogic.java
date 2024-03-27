import java.util.*;

public class SwapNumbersUsingAllLogic {
    static void ThirdVar(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;

        // System.out.println("After a swaping: " + a + " " + b);
    }

    static void UsingArth(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        // System.out.println("After a swaping: " + a + " " + b);

    }

    static void MultiDiv(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        // System.out.println("After a swaping: " + a + " " + b);

    }

    static void Bit(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // System.out.println("After a swaping: " + a + " " + b);
        
    }
    
    static void stet(int a,int b)
    {
        b=a+b-(a=b);
        System.out.println("After a swaping: " + a + " " + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();
        ThirdVar(num1, num2);
        UsingArth(num1, num2);
        MultiDiv(num1, num2);
        Bit(num1, num2);
        stet(num1, num2);
    }

}
