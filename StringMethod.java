import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String name = sc.next();
        // System.out.println("This is your Lowercase string:" + name.toLowerCase());
        // System.out.println("This is your Uppercase string:" + name.toUpperCase());
        String Surname = "Programer Life";
        // System.out.println(Surname);
        // System.out.println(Surname.trim());
        // System.out.println(Surname.substring(9));
        // System.out.println(Surname.substring(9, 20));
        System.out.println(Surname.replace("Programer", "Ganesh"));
        // System.out.println(Surname.startsWith("Pro"));
        // System.out.println(Surname.endsWith("e"));
        // System.out.println(Surname.charAt(5));
        System.out.println(Surname.indexOf("L"));
        System.out.println(Surname.indexOf("P",5));
        System.out.println(Surname.lastIndexOf("Lif"));
        System.out.println(Surname.equals("Life"));
        System.out.println(Surname.equalsIgnoreCase("programer Life"));
    }
}             
