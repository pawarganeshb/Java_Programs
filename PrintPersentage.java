import java.util.Scanner;

public class PrintPersentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks of physics:");
        int m1=sc.nextInt();
        System.out.println("Enter a marks of chemistry:");
        int m2=sc.nextInt();
        System.out.println("Enter a marks of Mathematics:");
        int m3=sc.nextInt();
        int sum=(m1+m2+m3)/3;
        System.out.print("You got ");
        System.out.print(sum);
        System.out.print(" Persentage in your CBSC bourd exam.");
    }

}
