import java.util.Scanner;

class emp {
    private int id;
    private String name;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a id:");
        id = sc.nextInt();
        System.out.println("Enter a name:");
        name = sc.next();
    }

    public void showdada() {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);

    }

    public void showdada(int id, String name) {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);

    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        emp e = new emp();
        e.getdata();
        e.showdada();
        e.showdada(12, "Shiva");
    }
}
