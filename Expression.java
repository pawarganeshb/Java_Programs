import java.util.Scanner;
public class Expression {
    public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter a value of 'v':");
                    float v=sc.nextFloat();
                    System.out.println("Enter a value of 'u':");
                    float u=sc.nextFloat();
                    System.out.println("Enter a value of 'a':");
                    float a=sc.nextFloat();
                    System.out.println("Enter a value of 's':");
                    float s=sc.nextFloat();
                    float Exp=(v*v)-(u*u)/(2*a*s);
                    System.out.println("Exepression: "+Exp);
                    
    }
    
}
