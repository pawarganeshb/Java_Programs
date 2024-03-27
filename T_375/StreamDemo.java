
import java.util.stream.*;
import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Satya");
        names.add("Mannya");
        names.add("Gotya");
        names.add("Sanskar");
        names.add("Zaameer");
        names.add("Ganesh");
        names.add("Arms");
        names.add("Kirty");
        names.add("Pooja");
        
        List<String>  newList1 = names.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList1);

        List<String> newList2 = names.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(newList2);

    }

}
