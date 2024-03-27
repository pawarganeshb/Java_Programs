public class IsAnagramUsingStringBuilderMethod {
    public static void main(String[] args) {
        String str1 = "Ganesh";
        String str2 = "aneGsh";
        boolean status = IsAnagram(str1, str2);
        if (status==true) {
            System.out.println("Both string are Anagram.");
            
        } else {
            System.out.println("Both string are not Anagram.");
        }

    }

    private static boolean IsAnagram(String str1, String str2) {
        char[] charstring1 = str1.toCharArray();
        StringBuilder sb = new StringBuilder(str2);
        for (char c : charstring1) {
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {
                sb.deleteCharAt(index);

            } else {
                return false;
            }

        }

        return sb.length() == 0;

    }

}
