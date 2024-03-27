public class PermutionUsingRecursion {
    public static void permution(String str, String perm) {
        if (str.length() == 0) {
            System.out.print(perm+"\t");
            return;

        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permution(newstr, perm + currchar);

        }
    }

    public static void main(String[] args) {
        String str = "ram";
        String perm = "";
        permution(str, perm);
    }

}
