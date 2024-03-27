//15] w.a.p to print revers number:
class ReverseNumberExample1 {
    public static void main(String[] args) {
        int number = 12345, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}