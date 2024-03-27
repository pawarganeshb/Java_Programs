import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "lala";
        String s2 = "laal";
        System.out.println(isAnagram(s1.toLowerCase(), s2.toLowerCase()));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2))
            return true;
        else
            return false;
    }
}
