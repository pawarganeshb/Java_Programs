public class Palindrom {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        System.out.println(isPalindrom(s1.toLowerCase()));
    }

    private static boolean isPalindrom(String string) {
        String rev = "";
        int len = string.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }
        if (string.equals(rev)) {
            return true;
        } else
            return false;
    }

}
