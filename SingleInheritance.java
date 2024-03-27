import java.util.Scanner;

class Prime {
    private int n;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        n = sc.nextInt();
    }

    public void showdata() {
        int count = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n + " is prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }

        } else {
            System.out.println(n + " is not prime number.");
        }
    }
}

class Even extends Prime {
    int n;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
    }

    public void show() {
        if (n % 2 == 0) {
            System.out.println(n + " is a Even number.");
        } else {
            System.out.println(n + " is not a Even numbr.");
        }
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.getdata();
        p.showdata();
        Even e = new Even();
        e.get();
        e.show();
    }

}
