public class BothStringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "bcda";
        boolean status = isrotation(str1, str2);
        if (status == true) {
            System.out.println("Your string is roteted.");

        } else {
            System.out.println("Your string is not roteted");
        }

    }

    private static boolean isrotation(String str, String rotedString) {
        boolean isroted = false;
        if (str == null || rotedString == null) {
            return false;

        } else if (str.length() != rotedString.length()) {
            return false;
        } else {
            String concatenated = str + str;
            return concatenated.contains(rotedString);
        }
        
    }

}
