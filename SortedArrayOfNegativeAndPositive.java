public class SortedArrayOfNegativeAndPositive {
    public static void main(String[] args) {
        int a[] = { -6, -1, 2, 4, 5 };
        int squarArray[] = sqarsortedArray(a);
        for (int i : squarArray) {
            System.out.print(i + "\t");

        }
    }

    private static int[] sqarsortedArray(int[] a) {
        int squarArray[] = new int[a.length];
        int start = 0;
        int end = a.length - 1;
        int squareindex = a.length - 1;
        while (start <= end) {
            if (a[start] * a[start] > a[end] * a[end]) {
                squarArray[squareindex--] = a[start] * a[start];
                start++;
            } else {
                squarArray[squareindex--] = a[end] * a[end];
                end--;
            }

        }
        return squarArray;

    }

}
