
//13] w.a.p to print student detail using setData and getData
import java.util.Scanner;

public class StudentDetail {
    String StudentName;
    String StudentCode;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name and student code : ");
        StudentName = sc.nextLine();
        StudentCode = sc.nextLine();
    }

    void getData() {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Student code: " + StudentCode);
    }

    public static void main(String[] args) {
        StudentDetail s1 = new StudentDetail();
        StudentDetail s2 = new StudentDetail();
        StudentDetail s3 = new StudentDetail();
        s1.setData();
        s2.setData();
        s3.setData();
        s1.getData();
        s2.getData();
        s3.getData();

    }

}
