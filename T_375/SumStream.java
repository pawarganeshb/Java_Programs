import java.util.ArrayList;
import java.util.List;

public class SumStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // list.add(7);
        // list.add(8);
        // list.add(9);
        // list.add(10);

        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        System.out.println(sum);

        int sum1 = list.stream().reduce(0, (I1, I2) -> I1 + I2);
        System.out.println(sum1);

        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(min);

        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);

        long count = list.stream().mapToInt(Integer::intValue).count();
        System.out.println(count);

        int avg = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Average is: " + (avg / 6));

    }

}
