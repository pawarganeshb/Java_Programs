//Q. w.a.p to demostrate constructor
class cnst {
    private int id;
    private String name;

    public cnst(int Myid, String Myname) {
        id = Myid;
        name = Myname;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }
}

public class Constructore {
    public static void main(String[] args) {
        cnst c = new cnst(108, "Ganesh Pawar");
        System.out.println("Name: " + c.getname());
        System.out.println("ID: " + c.getid());
    }
}
