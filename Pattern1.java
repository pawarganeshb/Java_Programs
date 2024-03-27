import java.util.*;

public class Pattern1 {
    static int ptrnRev(int n) {
        System.out.println("In Revers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        return 0;
    }

    static int ptrn(int n) {
        System.out.println("your pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many column you want:");
        short sh = sc.nextShort();
        ptrn(sh);
        ptrnRev(sh);
    }

}
