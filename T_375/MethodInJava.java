public class MethodInJava {
    static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int s = sum(num1, num2);
        System.out.println("sum is: " + s);
    }
}
