import java.util.HashSet;
import java.util.Scanner;
public class InterSectionOfTwoArray {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the 5 element for first array:");
       int arry1[]=new int[5];
       for (int i = 0; i < arry1.length; i++) {
           arry1[i]=sc.nextInt();
           
       }
       System.out.println("Enter the 5 element for second array:");
       int arry2[]=new int[5];
       for (int i = 0; i < arry2.length; i++) {
           arry2[i]=sc.nextInt();
           
       }
       /*
       System.out.println("Same element in both arrays:  ");
       for (int i = 0; i < arry1.length; i++) {
           for (int j = 0; j < arry2.length; j++) {
               if (arry1[i]==arry2[j]) {
                   System.out.println(arry1[i]);
                }
               }
           
       }*/

       InterSection(arry1,arry2);       
   }
   private static void  InterSection(int[] arry1,int[] arry2) {
       HashSet<Integer> hs=new HashSet<>();
       for (int i = 0; i < arry1.length; i++) {
           hs.add(arry1[i]);
           
       }
       System.out.println("This number in both of array: ");
       for (int i = 0; i < arry2.length; i++) {
           if(hs.contains(arry2[i])){
               System.out.println(arry2[i]);
           }
           
       }
   }

}
 