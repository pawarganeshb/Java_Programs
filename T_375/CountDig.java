public class CountDig {
    public static void main(String[] args) {
        long num = 7397812008L;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            ++count;

        }
        System.out.println(count);
    }

}
