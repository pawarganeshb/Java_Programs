import java.util.HashSet;

public class DuplicateStringInArray {
    public static void main(String[] args) {
        String s[] = { "Java", "C++", "C#", "Java" };
        boolean check = false;

        // for (int i = 0; i < s.length; i++) {
        //     for (int j = i + 1; j < s.length; j++) {
        //         if (s[i] == s[j]) {
        //             System.out.println("Duplicate String is found: " + s[i]);
        //             check = true;
        //         }

        //     }

        // }
        // if (check == false) {
        //     System.out.println("Duplicate String is not found.");
        // }

        HashSet<String> has = new HashSet<>();
        for (String string : s) {
            if (has.add(string) == false) {
                System.out.println("Duplicate String is found: " + string);
                check = true;
            }

        }
        if (check == false) {
            System.out.println("Duplicate string is not found.");
        }
    }
}