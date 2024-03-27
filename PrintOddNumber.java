import java.util.Scanner;
public class PrintOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        byte n=sc.nextByte();
        System.out.print("Your odd numbers list is: ");
        for (int i = 0; i <=n; i++) {
            System.out.print(2*i+1+"\t");
            
        }
    }
    
}
