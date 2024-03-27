public class FirstAndLastOccuramce {
    public static int first = -1;
    public static int last = -1;

    public static void fstadlstoccrance(String str, int idx, char ele) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curntchar = str.charAt(idx);
        if (curntchar == ele) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
            fstadlstoccrance(str, idx + 1, ele);

        }

    }

    public static void main(String[] args) {
        String str = "abcaadaaefgaj";
        fstadlstoccrance(str, 0, 'a');
    }

}
