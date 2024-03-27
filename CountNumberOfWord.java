public class CountNumberOfWord {
    public static void main(String[] args) {
        String str = "welcome to the java word";
        int count = countnumberofword(str);
        System.out.println("Total words in string is: "+count);
    }

    private static int countnumberofword(String str) {
        int count = 0;

        if (str.charAt(0) != ' ') {
            count++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                ++count;
            }

        }
        return count;

    }

}
