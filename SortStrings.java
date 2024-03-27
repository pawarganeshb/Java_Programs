import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters a 5 names: ");
        String names[] = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();

        }
        String temp;
        System.out.print("Before sorting: ");
        for (String s : names) {
            System.out.print(s + "\t");

        }
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }

            }

        }
        System.out.print("\nAfter sorting: ");
        for (String s : names) {
            System.out.print(s + "\t");

        }
    }

}
