public class NumbersOfVowelsAndConsonant {
    public static void main(String[] args) {
        String string = "Ganesh";
        countvowels(string);
    }

    private static void countvowels(String string) {
        int vowelcount = 0;
        int consonantcount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isvowels(string.charAt(i))) {
                vowelcount++;

            } else
                consonantcount++;

        }
        System.out.println("Numbers of consonant is: " + consonantcount);
        System.out.println("Numbers of vowels is: " + vowelcount);

    }

    private static boolean isvowels(char ch) {
        ch = Character.toUpperCase(ch);
      return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

}
