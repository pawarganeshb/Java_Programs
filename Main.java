import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks1");
        float m1=sc.nextInt();
        System.out.println("Enter a marks2");
        float m2=sc.nextInt();
        System.out.println("Enter a marks3");
        float m3=sc.nextInt();
        float cgpa=(m1+m2+m3)/30;
        System.out.println("CGPA is:"+cgpa);       
    }
}