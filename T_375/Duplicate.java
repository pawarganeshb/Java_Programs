public class Duplicate {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 6 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length;j++) {
                if (a[i] == a[j])
                    System.out.println("found duplicete at " + (i + 1) + "th position");
                break;
            }

        }
    }
}
