import java.util.Scanner;

class LowestNumber {
    public void LowestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 element: ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }
        System.out.println("Lowest number is: " + min);
    }
}

public class LowestNumberInArray {
    public static void main(String[] args) {
        LowestNumber LN = new LowestNumber();
        LN.LowestNumber();
    }
}
