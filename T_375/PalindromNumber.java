public class PalindromNumber {
    public static void main(String[] args) {
        int n = 1211;
        int rev = 0;
        int cpy = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;

        }
        if (rev == cpy) {
            System.out.println("Given number is Palindrom.");
        } else
            System.out.println("Given number isn't palindrom.");
    }
}
