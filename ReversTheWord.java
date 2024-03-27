import java.util.Scanner;

public class ReversTheWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String  splitwords[]=str.split(" ");
        System.out.print("Revers the words: ");
        for (int i = splitwords.length-1; i >= 0; i--) {

            System.out.print(splitwords[i]+" ");
        }
    }
    
}
