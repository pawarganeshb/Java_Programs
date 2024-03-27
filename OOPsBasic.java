public class OOPsBasic {
    public static void main(String... args) {
        System.out.println("This is main method.");
        colleg c1 = new colleg("MGMS");
    }
}

class colleg {
    static String cName;

    public colleg(String name) { // constructor
        System.out.println("Colleg Name: " + name);
    }

    void show() {
        System.out.println("Student are walking...");
    }
}

class Student extends colleg {
    public Student(String name) {
        super(name);
        System.out.println(colleg.cName);
    }
}
