import java.util.Scanner;

class Search {
    private int temp = 0;

    Scanner sc = new Scanner(System.in);

    public void GetLIst() {
        System.out.println("**************Search*************");
        System.out.println("Enter a 5 Element: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a search element:");
        int s = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (s == a[i]) {
                System.out.println(s + " is found");
                temp = 1;
                break;
            }

        }
        if (temp == 0) {
            System.out.println(s + " is not found.");
        }
    }
}

class BubbleSort extends Search {
    public void display() {
        System.out.println("**************Sorted Array*************");
        System.out.println("Enter a 5 element: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + "\t");
        }
    }
}

class Greater extends BubbleSort {
    public void show() {
        System.out.println("\n**************Greater Number*************");
        System.out.println("Enter a 5 element: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        System.out.println("Greater number in thes array: ");
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Search s = new Search();
        s.GetLIst();
        BubbleSort b = new BubbleSort();
        b.display();
        Greater g = new Greater();
        g.show();
    }
}