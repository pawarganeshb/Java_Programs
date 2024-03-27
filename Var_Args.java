public class Var_Args {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }

    private static void sum(int... a) {
        // System.out.println("The number of argument is: " + a.length);
        int sum = 0;
        for (int i : a) {
            sum = sum + i;

        }
        System.out.println(sum);
    }

}
