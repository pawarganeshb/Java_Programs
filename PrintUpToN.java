import java.util.Scanner;

public class PrintUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i=1;
        while (i <= num) {
            System.out.print(i+"\t");
            i++;            
        }
    }
    
}
