import java.util.Scanner;

public class InsertElementAtSpecificPosition {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 5 element: ");   
      int a[]=new int[6];
      for (int i = 0; i < a.length-1; i++) {
          a[i]=sc.nextInt();
          
      }
      System.out.println("Before inserting element in array: ");
      for (int i : a) {
          System.out.print(i+"\t");          
      }
      System.out.println("\nEnter the loction: ");
      int location=sc.nextInt();
      System.out.println("which element do  you want to insert in this array: ");
      int element=sc.nextInt();
      for (int i = a.length-1; i > location; i--) {
          a[i]=a[i-1];
          
      }
      a[location]=element;
      System.out.println("After the insert element in this array: ");
      for (int i : a) {
          System.out.print(i+"\t");
          
      }
    }
}
