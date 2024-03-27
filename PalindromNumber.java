import java.util.Arrays;

public class PalindromNumber {
     public static void anagram(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals( ch1,ch2))
        System.out.println("Given string are anagarm.");
        else
        System.out.println("Given string are not anagram string.");
    }
    public static void main(String[] args) {
        palindromNumber(121);
        palindromString("Madam".toLowerCase());
        anagram("java","vaja");
    }

    private static void palindromString(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        if (temp.equals(str))
            System.out.println("Palindrom String");
        else
            System.out.println("Not Palindrom String.");
    }

    private static void palindromNumber(Integer num) {
        int cpy = num;
        int temp = 0;
        while (num > 0) {
            temp = temp * 10 + num % 10;
            num /= 10;
        }
        if (cpy == temp) {
            System.out.println("Palindrom Number.");
        } else
            System.out.println("Not Palindrom Number.");
    }

}