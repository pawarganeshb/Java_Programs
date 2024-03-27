import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter a 5 element: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("Sum of array element is: "+sum);
    }
    
}
