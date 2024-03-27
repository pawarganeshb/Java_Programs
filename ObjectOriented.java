class Employee1 {
    int id;
    String name;

    public void printDetail() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class ObjectOriented {
    public static void main(String[] args) {
        Employee1 ep = new Employee1();
        ep.id = 108;
        ep.name = "Ganesh Pawar";
        ep.printDetail();
        Employee1 Ep = new Employee1();
        Ep.id = 106;
        Ep.name = "Shivanand Patil";
        System.out.println("your secondry class: ");
        Ep.printDetail();
    }
}