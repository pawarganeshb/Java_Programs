public class MethodOverloding {
    public void sum() {
        float num1 = 12.1f;
        float num2 = 10.5f;
        System.out.println("Addition of floating number is: " + (num1 + num2));
    }

    public void sum(int s) {
        int num1 = 11;
        int num2 = 90;
        s = num1 + num2;
        System.out.println("Addition of integer number is: " + s);
    }

    public void sum(Double num1, Double num2) {
        System.out.println("Addition double number is: " + (num1 + num2));
    }

    public void sum(String s, String str1, String str2) {
        s = str1 + str2;
        System.out.println("Addition  of string is: " + s);
    }

    public static void main(String[] args) {
        MethodOverloding m1 = new MethodOverloding();
        m1.sum();
        m1.sum(0);
        m1.sum(10.1, 20.23);
        m1.sum(null, "Ganesh ", "Pawar");
    }
}
