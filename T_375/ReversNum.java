public class ReversNum {
    public static void main(String[] args) {
        byte b = 127;
        int rev = 0;
        while (b != 0) {
            rev = rev * 10 + b % 10;
            b /= 10;
        }
        System.out.println(rev);
    }
}