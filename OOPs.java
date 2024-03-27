class Pen {
    String color;
    String Brand;

    public void write() {
        System.out.println("Write a something.");
    }

    public void print() {
        System.out.println(this.color);
        System.out.println(this.Brand);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Bulue";
        pen1.Brand = "Gel";
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.Brand = "BallPoint";
        pen1.write();
        pen2.write();
        pen1.print();
        pen2.print();
    }

}
