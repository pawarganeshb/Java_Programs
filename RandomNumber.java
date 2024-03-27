import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        System.out.println(rand_int);
    }
}
