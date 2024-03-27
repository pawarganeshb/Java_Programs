import java.util.Scanner;

public class RemoveUnwantedCharecter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with special symbols:");
        String str = sc.nextLine();
        String rplce = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(rplce);
    }
    
}
