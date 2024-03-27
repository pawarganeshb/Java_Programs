public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "bba";
        boolean status = isAnagram(str1, str2);
        if (status == true)
            System.out.println("Both string are anagram");
        else
            System.out.println("Both string are not an anagram");
    }

    private static boolean isAnagram(String str1, String str2) {
        char[] count = new char[256];
        for (int i = 0; i < str1.length(); i++) {
            ++count[str1.charAt(i)];
            --count[str2.charAt(i)];
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;

    }

}
