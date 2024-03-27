public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // swwap1(a, b);
        swap2(a, b);
    }

    private static void swap2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        System.out.println("a= " + a + "  b= " + b);

    }

    private static void swwap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= " + a + "  b= " + b);
    }

}
