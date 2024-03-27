public class MaxMin {
    public static void main(String[] args) {
        int[] a = new int[] { 73, 97, 81, 200, 8 };
        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    min = a[j];
                }
                if (a[j] > a[i]) {
                    max = a[j];
                }

            }

        }
        System.out.println("Smallest number: " + min);
        System.out.println("Bigest number: " + max);
    }

}
