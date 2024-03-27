public class CalculateXPower {
    public static int calpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }
        return x * calpow(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println((x) + "^" + (n) + " is -> " + calpow(x, n));
    }

}
