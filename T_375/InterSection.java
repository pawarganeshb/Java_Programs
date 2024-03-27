import java.util.HashSet;

public class InterSection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5 };
        int[] arr2 = { 9, 4, 2, 6 };
        InterSection(arr1, arr2);
    }

    private static void InterSection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                System.out.println(arr2[i]);
            }

        }
    }

}
