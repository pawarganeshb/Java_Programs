abstract class Shape {

}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((1 / 2) * l * h);
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area(2, 8);

    }

}
