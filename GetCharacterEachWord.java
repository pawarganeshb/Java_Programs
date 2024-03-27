
public class GetCharacterEachWord {
    public static void main(String[] args) {
      
        String str = "Mahatma Gandi's Mission";
        splitword(str);
    }

    private static void splitword(String str) {
        String word[] = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            String s = word[i];
            System.out.print(s.charAt(0));
        }
    }

}
