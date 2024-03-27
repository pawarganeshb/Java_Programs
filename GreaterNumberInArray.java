import java.util.Scanner;

class Greater {
    void Greater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 number");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println(max + " is Greater number.");
    }
    protected void finalize(){
        
    }
}

public class GreaterNumberInArray {
    public static void main(String[] args) {
        Greater gtr = new Greater();
        gtr.Greater();
    }
}
