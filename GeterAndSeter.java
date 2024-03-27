class Employee {
    private String name;
    private int id;

    public void setid(int i) {
        this.id = i;
    }

    public void setname(String n) {
        this.name = n;
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }
}

public class GeterAndSeter {
    public static void main(String[] args) {
        Employee ep = new Employee();
        ep.setid(108);
        ep.setname("Ganesh Pawar");
        System.out.println("ID = " + ep.getid());
        System.out.println("Name = " + ep.getname());
    }
}