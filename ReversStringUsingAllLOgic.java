import java.util.*;

public class ReversStringUsingAllLOgic {
    static String mainL(String str) {
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    static StringBuffer strbuff(String str) {
        StringBuffer st = new StringBuffer(str);
        StringBuffer rev = st.reverse();
        return rev;
    }

    static StringBuilder strbui(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder rev = sb.reverse();
        return rev;
    }

    static void chararray(String str) {
        char[] a = str.toCharArray();
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = (rev + str.charAt(i));

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        // System.out.println("your revers string using main logic is: "+mainL(str));
        // System.out.println("your revers string using stringbuffer is:
        // "+strbuff(str));
        // System.out.println("your revers string using stringbuilder is:
        // "+strbuff(str));
        System.out.println("your revers string using chararray is: " + strbuff(str));
    }

}
