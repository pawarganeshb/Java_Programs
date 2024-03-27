
//12] w.a.p. to print mobile bill
import java.util.Scanner;

public class MobileBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a MobileName: ");
        String MobileName = sc.nextLine();
        System.out.println("Enter a Prise: ");
        float prise = sc.nextFloat();
        float cgst = (prise * 0.18f);
        float sgst = (prise * 0.12f);
        float TotalAmount = prise + cgst + sgst;
        System.out.println("Mobile Name: " + MobileName);
        System.out.println("Prise: " + prise);
        System.out.println("CGST(18%): " + cgst);
        System.out.println("SGST(12%): " + sgst);
        System.out.println("Total Amount: " + TotalAmount);

    }

}
