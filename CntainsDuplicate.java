public class CntainsDuplicate {
    public static void main(String... args) {
        int a[] = { 12, 2, 13, 56, 2 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    System.out.println(a[j] + " is duplicate at " + (j + 1) + "th" + " positon.");

                }
            }
        }
    }

}
