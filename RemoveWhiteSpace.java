import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "MGM's COLLAGE CS & IT NANDED. ";
        str = str.replaceAll("//s", "");
        System.out.println("After the removing white spaces: " + str);

    }

}
