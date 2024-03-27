public class MethodOverloding {
    static void foo() {
        System.out.println("Hear is no any number.");
    }

    static void foo(long number) {
        System.out.println("NO: " + number);
    }

    static void foo(String name, long number) {
        System.out.println("Your Name: " + name);
        System.out.println("Your Number: " + number);
    }

    public static void main(String[] args) {
        long number = 7397812008L;
        String name = "Ganesh Pawar";
        foo();
        foo(number);
        foo(name, number);
    }

}