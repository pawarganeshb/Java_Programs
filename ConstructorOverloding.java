class Prime {
    private boolean check = true;
    private int count = 0;

    public Prime(int n) {
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println(n + " is the prime number.");
            } else {
                System.out.println(n + " is not the prime number.");
            }
        } else {
            System.out.println(n + " is not the prime number.");
        }

    }

    public Prime(int n, boolean check) {
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println(n + " is the prime number.");
            } else {
                System.out.println(n + " is not the prime number.");
            }
        } else {
            System.out.println(n + " is not the prime number.");
        }

    }

    public Prime(int n, boolean check, int count) {
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println(n + " is the prime number.");
            } else {
                System.out.println(n + " is not the prime number.");
            }
        } else {
            System.out.println(n + " is not the prime number.");
        }

    }
}

public class ConstructorOverloding {
    public static void main(String[] args) {
        PrimeNum p0 = new PrimeNum();
        PrimeNum p1 = new PrimeNum();
        PrimeNum p3 = new PrimeNum();

    }
}
