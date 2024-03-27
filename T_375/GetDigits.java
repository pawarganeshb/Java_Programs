public class GetDigits {
    public static void main(String[] args) {
        int number = 739781;
        System.out.println(getDig(number));
    }

    private static int getDig(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
