
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        String string;
        string ="Proffesional";
        Map<Character, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (mp.get(string.charAt(i)) != null) {
                mp.put(string.charAt(i), mp.get(string.charAt(i)) + 1);
            } else {
                mp.put(string.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (java.util.Map.Entry<Character, Integer> entry : mp.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());

        }
        System.out.println(sb.toString());
    }

}
