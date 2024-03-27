public class StudentMarks {
    int m1, m2, m3;
    String studName;

    StudentMarks(String studeName, int m1) {
        this.studName = studeName;
        this.m1 = m1;
    }

    StudentMarks(String studName, int m1, int m2) {
        this.studName = studName;
        this.m1 = m1;
        this.m2 = m2;

    }

    void show() {
        System.out.println(studName + "-" + m1 + "," + m2 + "," + m3);
    }

    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks("karan", 70, 80);
        StudentMarks s2 = new StudentMarks("shravani", 70, 80);
        StudentMarks s3 = new StudentMarks("komal", 90, 85);
        s1.show();
        s2.show();
        s3.show();
    }

}
