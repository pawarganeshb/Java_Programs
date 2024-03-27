public class FibonacchiUsingRecursion {
    public static void printfib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 12;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        printfib(a, b, n - 2);
    }
}