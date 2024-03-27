public class Student {
    String studentCode = "";
    String studentName = "";

    Student() {
        studentCode = "";
        studentName = "";
    }

    Student(String studentCode, String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
    }

    void show() {
        System.out.println("student code: " + studentCode);
        System.out.println("student name: " + studentName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("s1739781200", "Ganesh");
        Student s2 = new Student("s1702092876", "Shiva");
        s1.show();
        s2.show();

    }

}

// w.a.p. to demostrate constructoer overloding.