public class SortedArrayusingRecursion {
    public static boolean sorArr(int[] a, int idx) {
        if (idx == a.length - 1) {
            return true;
        }
        if (a[idx] >= a[idx + 1]) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 6, 7 };
        System.out.println(sorArr(a, 0));
    }

}
