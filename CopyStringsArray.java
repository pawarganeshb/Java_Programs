public class CopyStringsArray {
    public static void main(String[] args) {
        String a1[] = new String[] { "C", "C++", "Java", "Python", "JavaScript" };
        String a2[] = new String[a1.length];
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];

        }
        System.out.println("Before copying: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + "\t");

        }
        System.out.println("\nAfter Copying: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + "\t");
        }
    }

}
